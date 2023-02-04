package org.digilinq.payment.eft.ports

import org.digilinq.payment.eft.model.ReversalTransaction
import org.digilinq.payment.eft.model.Transaction

interface CardTransactionRepositoryPort {
    fun findTransactions(): List<Transaction>
    fun performTransaction(transaction: Transaction)
    fun reverseTransaction(reversalTransaction: ReversalTransaction)
}