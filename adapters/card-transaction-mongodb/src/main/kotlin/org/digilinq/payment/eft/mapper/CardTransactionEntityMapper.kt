package org.digilinq.payment.eft.mapper

import org.digilinq.payment.eft.model.FinancialTransaction
import org.digilinq.payment.eft.model.ReversalTransaction
import org.digilinq.payment.eft.model.TransactionEntity
import org.mapstruct.Mapper

@Mapper(componentModel = "spring")
interface CardTransactionEntityMapper {
    fun map(financialTransaction: FinancialTransaction): TransactionEntity
    fun map(reversalTransaction: ReversalTransaction): TransactionEntity
    fun map(transactionEntity: TransactionEntity): FinancialTransaction
}