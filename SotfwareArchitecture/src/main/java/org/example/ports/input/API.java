package org.example.ports.input;

public interface API {
    boolean moneyTransfer(long idFrom, long idTo, double amount);

    double getBalances(long id);
}
