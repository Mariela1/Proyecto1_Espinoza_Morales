package com.bank.model;


public class BankAccount {
    private String accountNumber;
    private double balance;
    private AccounType accounType;

    // Constructor
    public BankAccount(String accountNumber, AccounType accounType) {
        this.accountNumber = accountNumber;
        this.accounType = accounType;
        this.balance = 0.0;
    }
    // Metodos getters y setters
    public void deposit(double amount) {

        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (accounType == AccountType.SAVINGS && (balance - amount) < 0) {
            return false;
        } else if (accounType == AccountType.CHECKING && (balance - amount) < -500) {
            return false;
        }
        balance -= amount;
        return true;
    }
}
