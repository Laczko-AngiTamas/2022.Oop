package Lab8_1.bank.utils;

import Lab8_1.bank.Bank;
import Lab8_1.bank.customer.Customer;
import Lab8_1.bank.models.BankAccount;
import Lab8_1.bank.models.SavingsAccount;

public class Main {
    public static void main(String[] args) {

        BankAccount account1 = new SavingsAccount(0.02);
        SavingsAccount account2 = new SavingsAccount(0.02);
        /*if(account1 instanceof SavingsAccount) {
            ((SavingsAccount)account1).addInterest();
        } */
        Bank bank1 = new Bank("OTP");
        Customer customer1 = new Customer("Tamas", "Laczko-Angi");
        customer1.addAccount(account1);
        account1.getBalance();
        customer1.getFirstName();
        System.out.println(customer1+" " + " "+account1);

    }
}
