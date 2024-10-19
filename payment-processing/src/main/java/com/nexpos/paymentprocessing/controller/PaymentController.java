package com.nexpos.paymentprocessing.controller;

import com.nexpos.paymentprocessing.model.Transaction;
import com.nexpos.paymentprocessing.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/payments")
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @PostMapping("/process")
    public ResponseEntity<Transaction> processPayment(@RequestBody Transaction transaction) {
        Transaction processedTransaction = paymentService.processPayment(transaction);
        return ResponseEntity.ok(processedTransaction);
    }
}
