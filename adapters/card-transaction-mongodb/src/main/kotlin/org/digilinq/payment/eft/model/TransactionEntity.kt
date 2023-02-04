package org.digilinq.payment.eft.model

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.math.BigDecimal
import java.time.LocalDateTime

@Document
data class TransactionEntity(
    @Id val id: ObjectId = ObjectId.get(),
    val amount: BigDecimal,
    val transactionDate: LocalDateTime,
    val cardNumber: String,
)