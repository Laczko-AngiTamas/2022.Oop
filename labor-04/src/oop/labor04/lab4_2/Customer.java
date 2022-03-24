package oop.labor04.lab4_2;

import java.util.ArrayList;

public class Customer {
    private final String firstName;
    private String lastName;
    private ArrayList<BankAccount> accounts = new ArrayList<>();


    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Customer(String firstName, ArrayList<BankAccount> accounts) {
        this.firstName = firstName;
        this.accounts = accounts;
    }

    public void setAccounts(ArrayList<BankAccount> accounts) {
        this.accounts = accounts;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", accounts=" + accounts +
                '}';
    }

    public ArrayList<BankAccount> getAccounts() {
        return accounts;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void addAccount(BankAccount acc1) {
        accounts.add(acc1);
        if (!(accounts.add(acc1)) == false) ;
        System.out.println("Cannot add account!");

    }


    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void closeAccount(BankAccount acc1) {

    }

}

