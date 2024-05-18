public class Prac_6_1 {
    // Define a custom exception class for "Divide by Zero" error
class DivideByZeroException extends Exception {
    // Constructor with a custom error message
    public DivideByZeroException(String message) {
        super(message);
    }
}

// Main class to demonstrate the user-defined exception
public class DivideByZeroExample {
    // Method to perform division and throw the custom exception if divisor is zero
    public static double divide(int numerator, int denominator) throws DivideByZeroException {
        if (denominator == 0) {
            throw new DivideByZeroException("Cannot divide by zero");
        }
        return (double) numerator / denominator;
    }

    public static void main(String[] args) {
        int numerator = 10;
        int denominator = 0;

        try {
            // Attempting division
            double result = divide(numerator, denominator);
            System.out.println("Result of division: " + result);
        } catch (DivideByZeroException e) {
            // Catching and handling the custom exception
            System.out.println("Error: " + e.getMessage());
        }
    }
}

    
}
