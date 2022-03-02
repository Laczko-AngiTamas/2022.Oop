package oop.labor02.bank;

public class BankAccount {
    // Adattagok (data)
    private double balance;
    private String accountNumber;

    //Constructor
    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public void deposit(double addition) {
        if (addition > 0) {
            balance += addition;
        }

    }

    boolean withdraw(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            return true;
        }
        return false;
    }

}

