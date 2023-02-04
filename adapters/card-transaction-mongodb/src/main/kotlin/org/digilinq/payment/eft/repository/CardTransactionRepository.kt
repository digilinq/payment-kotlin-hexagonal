package org.digilinq.payment.eft.repository

import org.digilinq.payment.eft.model.CardTransactionEntity
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface CardTransactionRepository : MongoRepository<CardTransactionEntity, String> {
}