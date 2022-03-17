package oop.labor03.lab3_2;

import oop.labor03.lab3_1.BankAccount;
import org.w3c.dom.ls.LSOutput;

public class Customer {
    private final String firstName;
    private String lastName;
    private BankAccount[] accounts = new BankAccount[MAX_ACCOUNTS];
    public static final int MAX_ACCOUNTS = 10;
    private int numAccounts;

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
        return null;


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
                System.out.println("Cannot add account!");}
        }

        public void setLastName (String lastName){
            this.lastName = lastName;
        }

        public void closeAccount (String accountNumber) {
            for(int i=0; i<this.numAccounts; i++) {
                if (accountNumber.equals(accounts[i].getAccountNumber())) {
                    accounts[i]=accounts[numAccounts-1];
                    accounts[numAccounts-1] = null;
                    numAccounts--;
                }
            }
        }

        @Override
        public String toString () {
            StringBuffer result = new StringBuffer();
            result.append(firstName + ' ' + lastName + "accounts: \n");
            for (int i = 0; i < numAccounts; ++i) {
                result.append("\t" + accounts[i].toString() + "\n");
            }
            return result.toString();
        }
    }
