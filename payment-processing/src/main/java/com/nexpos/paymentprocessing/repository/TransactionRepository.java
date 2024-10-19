package com.nexpos.paymentprocessing.repository;

import com.nexpos.paymentprocessing.model.Transaction;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TransactionRepository extends MongoRepository<Transaction, String> {
    // Additional query methods can be defined here
}
