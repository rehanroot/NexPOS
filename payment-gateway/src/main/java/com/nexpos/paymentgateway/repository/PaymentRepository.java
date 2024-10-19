package com.nexpos.paymentgateway.repository;

import com.nexpos.paymentgateway.model.PaymentTransaction;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PaymentRepository extends MongoRepository<PaymentTransaction, String> {
}
