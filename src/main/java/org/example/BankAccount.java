package org.example;

public class BankAccount {

    private final String accountNumber;
    private double balance;
    private String ownerName;

    public BankAccount(String accountNumber, double balance, String ownerName) {


        if (balance < 0) {
          throw new IllegalArgumentException("Initial balance cannot be negative");
        }

        if (accountNumber == null || accountNumber.trim().isEmpty()) {
            throw new IllegalArgumentException("Account number cannot be empty");
        }

        if (ownerName == null || ownerName.trim().isEmpty()) {
            throw new IllegalArgumentException("Owner name cannot be empty");
        }

        this.accountNumber = accountNumber;
        this.balance = balance;
        this.ownerName = ownerName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

//    public void setBalance(double balance) {
//        this.balance = balance;
//    } This breaks encasuplation, if someone can set the balance directly, they can bypass all validation logic!

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void deposit(double amount) {
        if(amount > 0){
            balance += amount;
        } else {
            System.out.println("You can't deposit negative amount");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
        } else if (amount < 0) {
            System.out.println("Amount must be greater than 0");
        } else {
            System.out.println("Insufficient funds, Balance: £" + balance);
        }
    }
}
