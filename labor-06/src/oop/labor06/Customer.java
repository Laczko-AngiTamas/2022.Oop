package oop.labor06;

import oop.labor06.BankAccount;

import java.util.ArrayList;

public class Customer {
    private final String firstName;
    private String lastName;
    private final int id;
    private static int numCustomers = 0;
    private ArrayList<BankAccount> accounts = new ArrayList<>();


    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        numCustomers++;
        this.id = numCustomers;
    }

    public Customer(String firstName, int id, ArrayList<BankAccount> accounts) {
        this.firstName = firstName;
        this.id = id;
        this.accounts = accounts;
    }

    public void setAccounts(ArrayList<BankAccount> accounts) {
        this.accounts = accounts;
    }

    public BankAccount getAccount(String accountNumber) {
        for (BankAccount ba : accounts) {
            if (accountNumber.equals(ba.getAccountNumber())) ;
            {
                return ba;
            }
        }
        return null;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void addAccount(BankAccount account) {
        accounts.add(account);

    }


    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public void closeAccount(String accountNumber) {
        for (int i = 0; i < accounts.size(); ++i) {
            if (accountNumber.equals(accounts.get(i).getAccountNumber())) {
                accounts.remove(i);
                break;
            }
        }
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "oop.labor06.Customer{"
                + "ID=" + id +'\''
                + "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", accounts=" + accounts +
                '}';
    }

}

