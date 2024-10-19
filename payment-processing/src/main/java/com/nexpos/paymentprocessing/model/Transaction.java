// src/main/java/com/nexpos/paymentprocessing/model/Transaction.java
package com.nexpos.paymentprocessing.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "transactions")
public class Transaction {
    @Id
    private String id;
    private String customerId;
    private double amount;
    private String paymentMethod; // e.g., credit card, digital wallet
    private String status; // e.g., SUCCESS, PENDING, FAILED

    // Getters and Setters
}
