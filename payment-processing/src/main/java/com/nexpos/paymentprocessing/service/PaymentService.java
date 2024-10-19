package com.nexpos.paymentprocessing.service;

import com.nexpos.paymentprocessing.model.Transaction;
import com.nexpos.paymentprocessing.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    @Autowired
    private TransactionRepository transactionRepository;

    public Transaction processPayment(Transaction transaction) {
        // Logic for processing payment goes here
        // Save the transaction to MongoDB
        return transactionRepository.save(transaction);
    }

    // Other payment-related methods can be added here
}
