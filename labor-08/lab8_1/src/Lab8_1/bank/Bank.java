package Lab8_1.bank;

import Lab8_1.bank.customer.Customer;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Customer> customers = new ArrayList<>();

    public Bank(String name) {
        this.name = name;
    }

    public int numCustomers() {
        return customers.size();
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public Customer getCustomer(int id) {
        for (Customer c : customers) {
            if (c.getId() == id) {
                return c;
            }
        }
        return null;
    }

    private void printCustomers(PrintStream printStream) {
        for (Customer c : customers) {
            printStream.println(c);
        }
    }

    public void printCustomersToStdOut() {
        printCustomers(System.out);
    }

    public void printCustomersTofile(String fileName) {
        try {
            printCustomers(new PrintStream(fileName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
