package org.digilinq.payment.eft.api

import org.digilinq.payment.eft.model.ReversalTransaction
import org.digilinq.payment.eft.model.Transaction

interface CardTransactionService {
    fun findTransactions(): List<Transaction>

    fun performTransaction(transaction: Transaction)

    fun reverseTransaction(reversalTransaction: ReversalTransaction)
}