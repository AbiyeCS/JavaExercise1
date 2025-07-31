package org.example;

public class CreditCardProcessor implements PaymentProcessor {

    // TODO: Implement all methods
    // processPayment should validate card and process
    @Override
    public boolean processPayment(double amount) {
        if(amount < 0) {
            System.out.println("ERROR: You can't pay negative amount");
            return false;
        }

        if(amount > 100000){
            System.out.println("ERROR: You've exceeded the Credit Card Limit");
            return false;
        }

        System.out.println("Processing $" + amount + " via credit card...");
        System.out.println("Contacting bank...");
        System.out.println("Payment approved!");

        return true;
    }

    // sendReceipt should send email receipt
    @Override
    public void sendReceipt(String email) {
        System.out.println("Thank you for using our services, an email has been sent to " + email);
    }

    // getPaymentMethod should return "Credit Card"
    @Override
    public String getPaymentMethod() {
        return "CreditCard";
    }
}
