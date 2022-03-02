package oop.labor02.bank;

import jdk.swing.interop.SwingInterOpUtils;
import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
    BankAccount account1 = new BankAccount("OTP00001");
        System.out.println(account1.getAccountNumber()+": "+account1.getBalance());
        account1.deposit(1000);
        System.out.println(account1.getAccountNumber()+": "+account1.getBalance());
        boolean result =account1.withdraw(500);
        if (!result) {
            System.out.println("You don't have sufficient funds for this operation!\n");
        }
        System.out.println(account1.getAccountNumber()+": "+account1.getBalance());
    boolean result2 = account1.withdraw(1000);
        if (!result2) {
            System.out.println("You don't have sufficient funds for this operation!\n");
        }
        System.out.println(account1.getAccountNumber()+": "+account1.getBalance());
    BankAccount account2 = new BankAccount("OTP00002");
        System.out.println(account2.getAccountNumber()+": "+account2.getBalance());
        account2.deposit(2000);
        System.out.println(account2.getAccountNumber()+": "+account2.getBalance());


    }
}
