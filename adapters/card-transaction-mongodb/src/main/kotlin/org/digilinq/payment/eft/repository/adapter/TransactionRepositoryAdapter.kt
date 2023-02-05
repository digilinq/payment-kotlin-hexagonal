package org.digilinq.payment.eft.repository.adapter

import org.digilinq.payment.eft.mapper.CardTransactionMapper
import org.digilinq.payment.eft.model.FinancialTransaction
import org.digilinq.payment.eft.model.ReversalTransaction
import org.digilinq.payment.eft.ports.CardTransactionRepositoryPort
import org.digilinq.payment.eft.repository.TransactionRepository
import org.springframework.stereotype.Component

@Component
class TransactionRepositoryAdapter(
    private val repository: TransactionRepository,
    private val mapper: CardTransactionMapper
) : CardTransactionRepositoryPort {
    override fun findTransactions(): List<FinancialTransaction> {
        return repository.findAll().map {
            mapper.map(it)
        }
    }

    override fun performTransaction(transaction: FinancialTransaction) {
        mapper.map(transaction).let {
            repository.save(it)
        }
    }

    override fun reverseTransaction(reversalTransaction: ReversalTransaction) {
        mapper.map(reversalTransaction).let {
            repository.save(it)
        }
    }
}