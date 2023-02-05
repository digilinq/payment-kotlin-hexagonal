package org.digilinq.payment.eft.ports

import org.digilinq.payment.eft.model.FinancialTransaction
import org.digilinq.payment.eft.model.ReversalTransaction

interface CardTransactionRepositoryPort {
    fun findTransactions(): List<FinancialTransaction>
    fun performTransaction(transaction: FinancialTransaction)
    fun reverseTransaction(reversalTransaction: ReversalTransaction)
}