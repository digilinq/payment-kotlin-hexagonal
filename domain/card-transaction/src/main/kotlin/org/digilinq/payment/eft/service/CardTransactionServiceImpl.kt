package org.digilinq.payment.eft.service

import org.digilinq.payment.eft.api.CardTransactionService
import org.digilinq.payment.eft.model.FinancialTransaction
import org.digilinq.payment.eft.model.ReversalTransaction
import org.digilinq.payment.eft.ports.CardTransactionRepositoryPort

class CardTransactionServiceImpl(
    private val repositoryPort: CardTransactionRepositoryPort
) : CardTransactionService {
    override fun findTransactions(): List<FinancialTransaction> {
        return repositoryPort.findTransactions()
    }

    override fun performTransaction(financialTransaction: FinancialTransaction) {
        repositoryPort.performTransaction(financialTransaction)
    }

    override fun reverseTransaction(reversalTransaction: ReversalTransaction) {
        repositoryPort.reverseTransaction(reversalTransaction)
    }
}