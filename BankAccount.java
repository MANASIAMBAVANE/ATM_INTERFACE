package com.example.atm;

public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds. Withdrawal cancelled.");
        } else {
            balance -= amount;
            System.out.println("$" + amount + " withdrawn successfully.");
        }
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("$" + amount + " deposited successfully.");
    }
}
