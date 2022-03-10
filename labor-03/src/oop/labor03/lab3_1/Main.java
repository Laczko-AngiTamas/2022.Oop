package oop.labor03.lab3_1;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("John", "Black");
        System.out.println(customer1);

        customer1.setAccount( new BankAccount("OTP00001"));
        System.out.println(customer1);
        customer1.getAccount().deposit(1000);
        System.out.println(customer1);
        Customer customer2 = new Customer("Mary", "White");
        customer2.setAccount( new BankAccount("OTP00002"));
        System.out.println(customer2);
        customer2.getAccount().deposit(2000);
        System.out.println(customer2);
        customer2.getAccount().withdraw(500);
        System.out.println(customer2);
        customer2.closeAccount();
        customer2.setLastName(customer1.getLastName());
        customer2.setAccount(customer1.getAccount());
        customer2.getAccount().withdraw(100);
        System.out.println("after marriage");
        System.out.println(customer1);
        System.out.println(customer2);

        Customer customer3 = new Customer("Tamas", "Laczko-Angi");
        System.out.println(customer3);
        customer3.setAccount(new BankAccount("OTP00004"));
        customer3.getAccount().deposit(9999999);
        System.out.println("Uzemanyag penz: " + customer3);
        customer3.getAccount().withdraw(1000);
        System.out.println(" 1L benzin: " + customer3);


    }

}