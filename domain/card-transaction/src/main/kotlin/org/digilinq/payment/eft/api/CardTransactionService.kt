package org.digilinq.payment.eft.api

import org.digilinq.payment.eft.model.FinancialTransaction
import org.digilinq.payment.eft.model.ReversalTransaction

interface CardTransactionService {
    fun findTransactions(): List<FinancialTransaction>

    fun performTransaction(financialTransaction: FinancialTransaction)

    fun reverseTransaction(reversalTransaction: ReversalTransaction)
}