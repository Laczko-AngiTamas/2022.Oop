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


    public void deposit(double dep) {
        if (dep > 0) {
            balance += dep;
        }

    }
}
