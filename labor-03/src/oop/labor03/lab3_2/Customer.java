package oop.labor03.lab3_2;

import oop.labor03.lab3_1.BankAccount;
import org.w3c.dom.ls.LSOutput;

public class Customer {
    private final String firstName;
    private String lastName;
    private BankAccount[] accounts = new BankAccount[100];
    public final static int MAX_ACCOUNTS = 10;
    private int numAccounts;
    private BankAccount[] accounts = new BankAccount[MAX_ACCOUNTS];

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public BankAccount getAccount() {
        for (int i = 0; i < numAccounts; i++) {
            if (getAccount().equals(accounts[i].getAccountNumber())) {
                return accounts[i];
            } else {
                return null;

            }
        }
    }


        public String getLastName () {
            return lastName;
        }

        public String getFirstName () {
            return firstName;
        }

        public void addAccount (BankAccount account){
            if (MAX_ACCOUNTS > this.numAccounts) {
                this.accounts[numAccounts] = account;
                numAccounts++;
            } else {
                System.out.println("ERROR");}
        }

        public void setLastName (String lastName){
            this.lastName = lastName;
        }

        public void closeAccount () {
            this.account = null;
        }

        @Override
        public String toString () {
            return account + "szamla tulajdonosa: " + this.firstName + " " + this.lastName;
        }
    }
