package oop.labor06;

public class BankAccount {
    // Adattagok (data)
    private double balance;
    private final String accountNumber;
    private static int numAccounts = 0;
    public static final String PREFIX = "OTP";
    public static final int ACCOUNT_NUMBER_LENGTH = 10;


    public BankAccount() {
        ++numAccounts;
        this.accountNumber = createAccountNumber();


    }

    private String createAccountNumber() {
        /*String result = PREFIX;
        ;
        int x = numAccounts, n = 0;
        while (x != 0) {
            x = x / 10;
            ++n;
        }
        for (int i = 0; i < ACCOUNT_NUMBER_LENGTH - (PREFIX.length() + n); ++i) {
            result = result + "0";
        }
        result = result + numAccounts;

        return result;*/
        // Könnyebb számlálási módszer, Stringbe átalakítva
        int zeros = ACCOUNT_NUMBER_LENGTH - PREFIX.length() - String.valueOf(numAccounts).length();
        return PREFIX + "0".repeat(zeros) + numAccounts;
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

    public boolean withdraw(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "balance=" + balance +
                ", accountNumber='" + accountNumber + '\'' +
                '}';
    }


}




