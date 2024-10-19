package com.nexpos.paymentgateway.service;

import com.nexpos.paymentgateway.model.PaymentTransaction;
import com.nexpos.paymentgateway.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentService {
    @Autowired
    private PaymentRepository paymentRepository;

    public PaymentTransaction createPayment(PaymentTransaction transaction) {
        return paymentRepository.save(transaction);
    }

    public List<PaymentTransaction> getAllPayments() {
        return paymentRepository.findAll();
    }

    public PaymentTransaction getPaymentById(String id) {
        return paymentRepository.findById(id).orElse(null);
    }
}
