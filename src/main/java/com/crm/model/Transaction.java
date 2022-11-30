package com.crm.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Transaction {
    private String transactionId;
    private String userEmail;
    private double amount;
    private int orderId;
}
