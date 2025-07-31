package org.example;

public interface PaymentProcessor {
    boolean processPayment(double amount);
    void sendReceipt(String email);
    String getPaymentMethod();
}
