package Lab8_1.bank.models;

public class CheckingAccount extends BankAccount {
    private double overdraftLimit;

    public CheckingAccount(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public boolean withdraw(double amount) {
        if (this.balance + overdraftLimit >= amount) {
            this.balance -= amount;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "CheckingAccount{" +
                "overdraftLimit=" + overdraftLimit +
                '}';
    }
}
