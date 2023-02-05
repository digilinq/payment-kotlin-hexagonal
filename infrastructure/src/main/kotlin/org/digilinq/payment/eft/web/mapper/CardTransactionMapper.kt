package org.digilinq.payment.eft.web.mapper

import org.digilinq.payment.eft.generated.v1.model.CardTransactionRequest
import org.digilinq.payment.eft.model.FinancialTransaction
import org.mapstruct.Mapper

@Mapper(componentModel = "spring")
interface CardTransactionMapper {
    fun map(cardTransactionRequest: CardTransactionRequest):FinancialTransaction
}