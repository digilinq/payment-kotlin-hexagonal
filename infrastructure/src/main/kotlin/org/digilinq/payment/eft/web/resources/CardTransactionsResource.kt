package org.digilinq.payment.eft.web.resources

import org.digilinq.payment.eft.api.CardTransactionService
import org.digilinq.payment.eft.generated.v1.api.TransactionsApi
import org.digilinq.payment.eft.generated.v1.model.CardTransactionRequest
import org.digilinq.payment.eft.web.mapper.CardTransactionMapper
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.time.OffsetDateTime

@RestController
@RequestMapping("/api/v1")
class CardTransactionsResource(
    private val service: CardTransactionService,
    private val mapper: CardTransactionMapper
) : TransactionsApi {
    override fun transactionsGet(
        rrn: String?,
        stan: String?,
        transactionDate: OffsetDateTime?,
        cardNumber: String?
    ): ResponseEntity<Unit> {
        return super.transactionsGet(rrn, stan, transactionDate, cardNumber)
    }

    override fun transactionsPost(cardTransactionRequest: CardTransactionRequest?): ResponseEntity<Unit> {

        cardTransactionRequest?.let {
            mapper::map.also { service::performTransaction }
        }
        return super.transactionsPost(cardTransactionRequest)
    }
}