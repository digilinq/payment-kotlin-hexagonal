FROM gradle:8.0.2 as GRADLE_BUILD
ENV APP_HOME=/usr/app/
WORKDIR $APP_HOME
COPY build.gradle settings.gradle $APP_HOME
  
COPY gradle $APP_HOME/gradle
COPY --chown=gradle:gradle . /home/gradle/src
USER root
RUN chown -R gradle /home/gradle/src
    
RUN gradle build || return 0
COPY . .
RUN gradle clean build

FROM openjdk:17

ENV ARTIFACT_NAME=payment-kotlin-hexagonal.jar
ENV APP_HOME=/usr/app/

WORKDIR $APP_HOME
COPY --from=GRADLE_BUILD $APP_HOME/build/libs/$ARTIFACT_NAME .

EXPOSE 8080

# ENTRYPOINT exec java -jar ${ARTIFACT_NAME}