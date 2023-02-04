package org.digilinq.payment.eft.mapper

import org.digilinq.payment.eft.model.FinancialTransaction
import org.digilinq.payment.eft.model.ReversalTransaction
import org.digilinq.payment.eft.model.TransactionEntity
import org.springframework.stereotype.Component

@Component
class CardTransactionMapperImpl : CardTransactionMapper {
    override fun map(financialTransaction: FinancialTransaction): TransactionEntity {
        TODO("Not yet implemented")
    }

    override fun map(reversalTransaction: ReversalTransaction): TransactionEntity {
        TODO("Not yet implemented")
    }

    override fun map(transactionEntity: TransactionEntity): FinancialTransaction {
        TODO("Not yet implemented")
    }
}