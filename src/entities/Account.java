package entities;

public class Account {
    private final int accountNumber;
    private String holder;
    private double balance;
    public static final double withdrawTax = 5.0;

    public Account(int number, String holder, double initialDeposit) {
        this.accountNumber = number;
        this.holder = holder;
        deposit(initialDeposit);
    }

    public Account(int accountNumber, String holder) {
        this.accountNumber = accountNumber;
        this.holder = holder;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount + withdrawTax;
    }

    @Override
    public String toString() {
        return "Número da conta: "
                + accountNumber + ", "
                + "Titular da conta: "
                + holder + ", "
                + "Saldo da conta: R$ "
                + String.format("%.2f", balance);
    }
}
