package org.example.logic.model;

import java.time.LocalDateTime;

public class Transaction {
    private long id;
    private long senderId;
    private long recipientId;
    private double amount;
    private LocalDateTime date;

    public Transaction(long senderId, long recipientId, double amount) {
        this.senderId = senderId;
        this.recipientId = recipientId;
        this.amount = amount;
        this.date = LocalDateTime.now();
    }

    // Getter & Setter
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public long getSenderId() {
        return senderId;
    }

    public long getRecipientId() {
        return recipientId;
    }

    public double getAmount() {
        return amount;
    }

    public LocalDateTime getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", senderId=" + senderId +
                ", recipientId=" + recipientId +
                ", amount=" + amount +
                ", date=" + date +
                '}';
    }
}
