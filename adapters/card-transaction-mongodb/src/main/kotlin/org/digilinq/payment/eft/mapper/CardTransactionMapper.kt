package org.digilinq.payment.eft.mapper

import org.digilinq.payment.eft.model.FinancialTransaction
import org.digilinq.payment.eft.model.ReversalTransaction
import org.digilinq.payment.eft.model.TransactionEntity

interface CardTransactionMapper {
    fun map(financialTransaction: FinancialTransaction): TransactionEntity
    fun map(reversalTransaction: ReversalTransaction): TransactionEntity
    fun map(transactionEntity: TransactionEntity): FinancialTransaction
}