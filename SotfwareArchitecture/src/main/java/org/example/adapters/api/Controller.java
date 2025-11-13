package org.example.adapters.api;

import org.example.ports.input.API;

public class Controller {
    private final API moneyTransferService;

    public Controller(API moneyTransferService) {
        this.moneyTransferService = moneyTransferService;
    }

    public boolean moneyTransfer(long idFrom, long idTo, double transfer) {
        return moneyTransferService.moneyTransfer(idFrom, idTo, transfer);
    }

    public double getBalance(long id) {
        return moneyTransferService.getBalances(id);
    }
}
