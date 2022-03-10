package oop.labor03.lab3_1;

public class Customer {
    private final String firstName;
    private String lastName;
    private BankAccount account;

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public BankAccount getAccount() {
        return account;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setAccount(BankAccount bank1) {
        this.account = bank1;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void closeAccount() {
        this.account = null;
    }
    @Override
    public String toString() {
        return account + "szamla tulajdonosa: " + this.firstName + " " + this.lastName;
    }
}

