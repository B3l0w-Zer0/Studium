package org.example.adapters.database;

import org.example.logic.model.Transaction;

public class TransactionMapper {

    public static transactionEntity toEntity(Transaction t, BankAccountEntity sender, BankAccountEntity recipient) {
        transactionEntity entity = new transactionEntity(sender, recipient, t.getAmount());
        entity.setDate(t.getDate());
        return entity;
    }

    public static Transaction toModel(transactionEntity e) {
        Transaction t = new Transaction(
                e.getSender().getId(),
                e.getRecipient().getId(),
                e.getAmount()
        );
        t.setId(e.getId());
        return t;
    }
}
