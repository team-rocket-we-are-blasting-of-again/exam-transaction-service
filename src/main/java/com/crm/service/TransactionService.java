package com.crm.service;

import com.crm.model.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class TransactionService {

    @Autowired
    private KafkaTemplate kafkaTemplate;

    public Transaction emitTransactionEvent(Transaction transaction) {
        String id = UUID.randomUUID().toString();
        transaction.setTransactionId(id);
        kafkaTemplate.send("new-transaction", id, transaction).isDone();
        transaction.setTransactionId(id);
        return transaction;
    }
}
