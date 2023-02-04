package org.digilinq.payment.eft.service

import org.digilinq.payment.eft.api.CardTransactionService
import org.digilinq.payment.eft.model.ReversalTransaction
import org.digilinq.payment.eft.model.Transaction
import org.digilinq.payment.eft.ports.CardTransactionRepositoryPort

class CardTransactionServiceImpl(
    private val repositoryPort: CardTransactionRepositoryPort
) : CardTransactionService {
    override fun findTransactions(): List<Transaction> {
        return repositoryPort.findTransactions()
    }

    override fun performTransaction(transaction: Transaction) {
        repositoryPort.performTransaction(transaction)
    }

    override fun reverseTransaction(reversalTransaction: ReversalTransaction) {
        repositoryPort.reverseTransaction(reversalTransaction)
    }
}