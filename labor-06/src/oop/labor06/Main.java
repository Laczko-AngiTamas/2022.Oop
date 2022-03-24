package oop.labor06;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Tamas", "Laczko-Angi");
        System.out.println(customer1);
        Customer customer2 = new Customer("Peter", "Pelda");
        System.out.println(customer2);

        ArrayList<BankAccount> account1 = new ArrayList<>();
        for (int i = 0; i < 200; i++) {
            account1.add(new BankAccount());
        }
        for (BankAccount x : account1) {
            System.out.println(x);
        }

        Customer customer3 = new Customer("Daniel", "Kiss");
        for(int i=0; i<2; i++) {
            customer3.addAccount(new BankAccount());
        }
        System.out.println(customer3);
        if(customer3.getAccount("OTP0000201") != null) {
            customer3.getAccount("OTP0000201").deposit(1000);
        }
        System.out.println(customer3);

    }
}
