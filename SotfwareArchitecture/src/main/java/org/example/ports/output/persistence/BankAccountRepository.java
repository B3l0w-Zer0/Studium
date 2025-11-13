package org.example.ports.output.persistence;

import org.example.logic.model.BankAccount;

public interface BankAccountRepository {
    BankAccount findAccountById(long id);

    void createAccount(long accountNumber, String accountHolder, double balance);

    boolean updateAccount(long id, BankAccount account);
}
