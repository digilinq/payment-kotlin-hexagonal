package org.digilinq.payment.eft.config

import org.digilinq.payment.eft.api.CardTransactionService
import org.digilinq.payment.eft.ports.CardTransactionRepositoryPort
import org.digilinq.payment.eft.service.CardTransactionServiceImpl
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration


@Configuration
class PaymentAppConfiguration(
    private val cardTransactionRepositoryPort: CardTransactionRepositoryPort
) {
    @Bean
    fun cardTransactionService(): CardTransactionService = CardTransactionServiceImpl(cardTransactionRepositoryPort)
}