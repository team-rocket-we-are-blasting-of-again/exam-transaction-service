package com.crm.control;

import com.crm.model.Transaction;
import com.crm.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@CrossOrigin
@RestController
@RequestMapping("")
public class TransactionController {
    @Autowired
    TransactionService transactionService;

    @PostMapping("/transaction")
    public Transaction post(@RequestBody Transaction transaction) {
        return transactionService.emitTransactionEvent(transaction);

    }
}
