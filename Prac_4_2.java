import java.util.HashMap;
import java.util.Map;

// BankAccount class representing a generic bank account
class BankAccount {
    private int accountNumber;
    private String accountHolderName;
    protected double balance;

    public BankAccount(int accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = 0.0;
    }

    // Method to deposit money
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }

    // Method to check balance
    public double checkBalance() {
        return balance;
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    // Method to calculate interest (to be implemented in subclasses)
    public void calculateInterest() {
        // Default implementation does nothing
    }

    // Method to open account
    public void openAccount() {
        System.out.println("Account opened for " + accountHolderName);
    }
}

// SavingAccount class representing a savings account
class SavingAccount extends BankAccount {
    private double interestRate;

    public SavingAccount(int accountNumber, String accountHolderName, double interestRate) {
        super(accountNumber, accountHolderName);
        this.interestRate = interestRate;
    }

    // Override method to calculate interest
    @Override
    public void calculateInterest() {
        double interest = balance * (interestRate / 100);
        balance += interest;
        System.out.println("Interest calculated: $" + interest);
    }
}

// FixedDepositAccount class representing a fixed deposit account
class FixedDepositAccount extends BankAccount {
    private int tenureMonths;
    private double interestRate;

    public FixedDepositAccount(int accountNumber, String accountHolderName, int tenureMonths, double interestRate) {
        super(accountNumber, accountHolderName);
        this.tenureMonths = tenureMonths;
        this.interestRate = interestRate;
    }

    // Override method to calculate interest
    @Override
    public void calculateInterest() {
        double interest = balance * (interestRate / 100) * (tenureMonths / 12.0);
        balance += interest;
        System.out.println("Interest calculated: $" + interest);
    }
}

public class Prac_4_2 {
    public static void main(String[] args) {
        // Creating and testing SavingAccount
        SavingAccount savingAccount = new SavingAccount(101, "John", 3.5);
        savingAccount.openAccount();
        savingAccount.deposit(1000);
        savingAccount.calculateInterest();
        System.out.println("Current balance: $" + savingAccount.checkBalance());
        savingAccount.withdraw(500);

        // Creating and testing FixedDepositAccount
        FixedDepositAccount fixedDepositAccount = new FixedDepositAccount(102, "Alice", 12, 5.0);
        fixedDepositAccount.openAccount();
        fixedDepositAccount.deposit(2000);
        fixedDepositAccount.calculateInterest();
        System.out.println("Current balance: $" + fixedDepositAccount.checkBalance());
        fixedDepositAccount.withdraw(1000);
    }
}