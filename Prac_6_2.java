import java.io.IOException;
public class Prac_6_2 {
    public static void main(String[] args) {
        try {
            // First try block
            try {
                // Division by zero exception
                int result = 10 / 0; // This will throw an ArithmeticException
            } catch (ArithmeticException e) {
                // Catching ArithmeticException
                System.out.println("ArithmeticException caught in the first try block");
                throw new IOException("IO Exception occurred"); // Throwing IOException
            } finally {
                // Finally block for the first try block
                System.out.println("Inside finally block of the first try block");
            }
        } catch (IOException e) {
            // Catching IOException thrown from the first try block
            System.out.println("IOException caught in the outer try block: " + e.getMessage());
        }

        try {
            // Second try block
            try {
                // Accessing an element out of the bounds of the array
                int[] arr = new int[5];
                arr[6] = 10; // This will throw an ArrayIndexOutOfBoundsException
            } catch (ArrayIndexOutOfBoundsException e) {
                // Catching ArrayIndexOutOfBoundsException
                System.out.println("ArrayIndexOutOfBoundsException caught in the second try block");
                throw new IllegalArgumentException("Illegal Argument Exception occurred"); // Throwing IllegalArgumentException
            } finally {
                // Finally block for the second try block
                System.out.println("Inside finally block of the second try block");
            }
        } catch (IllegalArgumentException e) {
            // Catching IllegalArgumentException thrown from the second try block
            System.out.println("IllegalArgumentException caught in the outer try block: " + e.getMessage());
        }
    }
}