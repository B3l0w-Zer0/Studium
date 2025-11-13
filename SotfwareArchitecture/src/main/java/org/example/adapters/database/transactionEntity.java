package org.example.adapters.database;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "transactions")
public class transactionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Beziehung: viele Transaktionen gehören zu einem Konto (Sender)
    @ManyToOne
    @JoinColumn(name = "sender_id", nullable = false)
    private BankAccountEntity sender;

    // Beziehung: viele Transaktionen gehören zu einem Konto (Empfänger)
    @ManyToOne
    @JoinColumn(name = "recipient_id", nullable = false)
    private BankAccountEntity recipient;

    @Column(nullable = false)
    private double amount;

    @Column(nullable = false)
    private LocalDateTime date;

    public transactionEntity() {
    }

    public transactionEntity(BankAccountEntity sender, BankAccountEntity recipient, double amount) {
        this.sender = sender;
        this.recipient = recipient;
        this.amount = amount;
        this.date = LocalDateTime.now();
    }

    // Getter & Setter
    public Long getId() {
        return id;
    }

    public BankAccountEntity getSender() {
        return sender;
    }

    public void setSender(BankAccountEntity sender) {
        this.sender = sender;
    }

    public BankAccountEntity getRecipient() {
        return recipient;
    }

    public void setRecipient(BankAccountEntity recipient) {
        this.recipient = recipient;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Transaction{id=" + id +
                ", sender=" + sender.getAccountHolder() +
                ", recipient=" + recipient.getAccountHolder() +
                ", amount=" + amount +
                ", date=" + date + '}';
    }
}
