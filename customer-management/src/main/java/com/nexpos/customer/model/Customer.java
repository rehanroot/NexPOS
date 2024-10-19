package com.nexpos.customer.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "customers")
public class Customer {
    @Id
    private String id;
    private String name;
    private String email;
    private String phone;
    private String address;

    // Constructors, getters, and setters
}
