package org.example;

import org.example.adapters.api.Controller;
import org.example.adapters.database.DatabaseAdapter;
import org.example.logic.services.MoneyTransferService;
import org.example.ports.output.persistence.BankAccountRepository;

public class Main {
    static void main() {
        /* Create all components and connect them */
        final BankAccountRepository database = new DatabaseAdapter();
        final MoneyTransferService moneyTransferService = new MoneyTransferService(database);
        Controller controller = new Controller(moneyTransferService);

        /* Create some demo data */
        database.createAccount(0, "Max Muster", 500.00);
        database.createAccount(1, "Peter Lustig", 3500.00);
        database.createAccount(2, "Nikolaus Klaus", 4500.00);
        database.createAccount(3, "Nino Dino", 9800.00);

        /* Show a use case to transfer money */
        final long fromId = 1;
        final long toAccount = 2;
        final double amountToTransfer = 200;
        System.out.println("Balance of account 1: " + controller.getBalance(1));
        System.out.println("Balance of account 2: " + controller.getBalance(2));
        final boolean transferSuccess = controller.moneyTransfer(fromId, toAccount, amountToTransfer);
        System.out.println("Transfer " + amountToTransfer + "€ from ID:" + fromId + " to ID: " + toAccount);
        System.out.println("Transferring money was successful: " + transferSuccess);
        System.out.println("Balance of account 1: " + controller.getBalance(1));
        System.out.println("Balance of account 2: " + controller.getBalance(2));
    }
}
