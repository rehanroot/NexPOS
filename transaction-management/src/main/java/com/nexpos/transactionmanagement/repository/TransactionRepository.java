package com.nexpos.transactionmanagement.repository;

import com.nexpos.transactionmanagement.model.Transaction;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TransactionRepository extends MongoRepository<Transaction, String> {
    // Additional query methods (if needed)
}
