FROM gradle:8.0.2 as GRADLE_BUILD
ENV APP_HOME=/usr/app/
WORKDIR $APP_HOME
COPY . .
RUN gradle build -x test

FROM openjdk:17
WORKDIR /work
COPY --from=GRADLE_BUILD /usr/app/build/libs/payment-kotlin-hexagonal.jar demo.jar