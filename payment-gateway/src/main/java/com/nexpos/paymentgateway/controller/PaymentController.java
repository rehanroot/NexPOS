package com.nexpos.paymentgateway.controller;

import com.nexpos.paymentgateway.model.PaymentTransaction;
import com.nexpos.paymentgateway.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/gateway")
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @PostMapping("/pay")
    public ResponseEntity<PaymentTransaction> createPayment(@RequestBody PaymentTransaction transaction) {
        return ResponseEntity.ok(paymentService.createPayment(transaction));
    }

    @GetMapping("/payments")
    public ResponseEntity<List<PaymentTransaction>> getAllPayments() {
        return ResponseEntity.ok(paymentService.getAllPayments());
    }

    @GetMapping("/status/{id}")
    public ResponseEntity<PaymentTransaction> getPaymentById(@PathVariable String id) {
        return ResponseEntity.ok(paymentService.getPaymentById(id));
    }
}
