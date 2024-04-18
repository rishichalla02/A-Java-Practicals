import java.util.Scanner;

class Account {
    private int accountId;
    private String name;
    private double balance;

    // Method to assign values to account
    public void assign(int accountId, String name, double balance) {
        this.accountId = accountId;
        this.name = name;
        this.balance = balance;
    }

    // Method to display account details
    public void display() {
        System.out.println("Account ID: " + accountId);
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
    }

    // Method to search for an account by ID
    public boolean search(int accountId) {
        return this.accountId == accountId;
    }
}

public class Prac_3_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create array of Account objects
        Account[] accounts = new Account[5];

        // Assign values to accounts
        accounts[0] = new Account();
        accounts[0].assign(101, "Rishi", 5000.0);

        accounts[1] = new Account();
        accounts[1].assign(102, "Nit", 6000.0);

        accounts[2] = new Account();
        accounts[2].assign(103, "Dharmik", 7000.0);

        accounts[3] = new Account();
        accounts[3].assign(104, "Urmil", 8000.0);

        accounts[4] = new Account();
        accounts[4].assign(105, "Archan", 9000.0);

        // Display details of all accounts
        System.out.println("Details of all accounts:");
        for (int i = 0; i < accounts.length; i++) {
            accounts[i].display();
            System.out.println();
        }

        // Search for an account
        System.out.print("Enter account ID to search: ");
        int searchId = scanner.nextInt();
        boolean found = false;
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i].search(searchId)) {
                System.out.println("Account found:");
                accounts[i].display();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Account not found.");
        }

        scanner.close();
    }
}
