    class InsufficientFundsException extends Exception {
        // Custom exception for insufficient funds
        public InsufficientFundsException(String message) {
            super(message);
        }
    }
    
    class Account {
        private double balance;
    
        // Constructor to initialize balance
        public Account(double initialBalance) {
            this.balance = initialBalance;
        }
    
        // Method to deposit money
        public void deposit(double amount) {
            balance += amount;
            System.out.println("Deposited: Rs " + amount);
            System.out.println("Current Balance: Rs " + balance);
        }
    
        // Method to withdraw money
        public void withdraw(double amount) throws InsufficientFundsException {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Withdrawn: Rs " + amount);
                System.out.println("Current Balance: Rs " + balance);
            } else {
                throw new InsufficientFundsException("Not Sufficient Funds");
            }
        }
    }
    
    public class Prac_6_3 {
        public static void main(String[] args) {
            // Create an account with initial balance Rs 1000
            Account account = new Account(1000.00);
    
            // Deposit Rs 1000
            account.deposit(1000.00);
    
            try {
                // Withdraw Rs 400
                account.withdraw(400.00);
    
                // Withdraw Rs 300
                account.withdraw(300.00);
    
                // Attempt to withdraw Rs 500 (Throws exception)
                account.withdraw(500.00);
            } catch (InsufficientFundsException e) {
                // Catch and handle the "Not Sufficient Funds" exception
                System.out.println("Exception caught: " + e.getMessage());
            }
        }
    }