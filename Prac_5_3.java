// Interface Exam
interface Exam {
    boolean Pass(int mark);
}

// Interface Classify
interface Classify {
    String Division(int average);
}

// Class Result implementing both Exam and Classify interfaces
class Result implements Exam, Classify {
    // Implementing Pass method from Exam interface
    @Override
    public boolean Pass(int mark) {
        return mark >= 50;
    }

    // Implementing Division method from Classify interface
    @Override
    public String Division(int average) {
        if (average >= 60) {
            return "First";
        } else if (average >= 50 && average < 60) {
            return "Second";
        } else {
            return "No division";
        }
    }
}

public class Prac_5_3 {
    public static void main(String[] args) {
        // Create an object of class Result
        Result result = new Result();

        // Test the Pass method
        System.out.println("Pass result for mark 70: " + result.Pass(70)); // true
        System.out.println("Pass result for mark 40: " + result.Pass(40)); // false

        // Test the Division method
        System.out.println("Division result for average 65: " + result.Division(65)); // First
        System.out.println("Division result for average 55: " + result.Division(55)); // Second
        System.out.println("Division result for average 40: " + result.Division(40)); // No division
    }
}