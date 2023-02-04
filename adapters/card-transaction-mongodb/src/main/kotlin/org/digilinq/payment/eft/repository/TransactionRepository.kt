package org.digilinq.payment.eft.repository

import org.digilinq.payment.eft.model.TransactionEntity
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface TransactionRepository : MongoRepository<TransactionEntity, String> {
}