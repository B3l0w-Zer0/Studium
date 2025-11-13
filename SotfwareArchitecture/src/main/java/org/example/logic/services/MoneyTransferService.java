package org.example.logic.services;

import org.example.logic.model.BankAccount;
import org.example.ports.input.API;
import org.example.ports.output.persistence.BankAccountRepository;

public class MoneyTransferService implements API {
    private final BankAccountRepository database;

    public MoneyTransferService(BankAccountRepository persistence) {
        database = persistence;
    }

    @Override
    public double getBalances(long id) {
        BankAccount account = database.findAccountById(id);

        if (account == null)
            throw new IllegalArgumentException("Account with id " + id + " not found");

        return account.getBalance();
    }

    @Override
    public boolean moneyTransfer(long idFrom, long idTo, double amount) {
        final BankAccount fromAccount = this.database.findAccountById(idFrom);
        final BankAccount toAccount = this.database.findAccountById(idTo);

        if (fromAccount == null || toAccount == null)
            return false;

        /* These two statements must be atomic, we talk about transactions later */
        /* Please note: this "money transfer" is part of the business logic and must be part of this class. */
        /* Don't implement this in class BankAccount or in the database adapter. */
        try {
            fromAccount.decreaseBalance(amount);
            toAccount.increaseBalance(amount);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

        this.database.updateAccount(idFrom, fromAccount);
        this.database.updateAccount(idTo, toAccount);

        return true;
    }
}
