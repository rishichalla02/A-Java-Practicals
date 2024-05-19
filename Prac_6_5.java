    // Custom exception class
class FirstArgumentException extends Exception {
    public FirstArgumentException(String message) {
        super(message);
    }
}

public class Prac_6_5 {
    public static void main(String[] args) {
        try {
            // Check if there are command line arguments
            if (args.length == 0) {
                throw new IllegalArgumentException("No command line arguments provided");
            }

            // Check if the first argument is 0
            if (args[0].equals("0")) {
                throw new FirstArgumentException("First argument cannot be 0");
            }

            // Print the first argument
            System.out.println("First argument: " + args[0]);
        } catch (FirstArgumentException e) {
            // Catch and handle the custom exception
            System.out.println("Custom exception caught: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            // Catch and handle if no command line arguments provided
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}