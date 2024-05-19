    // Custom exception class IllegalMarkException
class IllegalMarkException extends Exception {
    public IllegalMarkException(String message) {
        super(message);
    }
}

// Class to represent a student's marklist
class Marklist {
    private String regNo;
    private int marks;

    public Marklist(String regNo, int marks) {
        this.regNo = regNo;
        this.marks = marks;
    }

    // Method to check and handle the marks
    public void checkMarks() {
        try {
            if (marks < 0) {
                throw new IllegalMarkException("Illegal Mark");
            }
            if (marks >= 40) {
                System.out.println("Reg No: " + regNo + " - PASS");
            } else {
                System.out.println("Reg No: " + regNo + " - FAIL");
            }
        } catch (IllegalMarkException e) {
            System.out.println("Reg No: " + regNo + " - " + e.getMessage());
        }
    }
}

public class Prac_6_6 {
    public static void main(String[] args) {
        // Example marklist data
        Marklist[] marklists = {
            new Marklist("001", 70),
            new Marklist("002", -10),
            new Marklist("003", 35)
        };

        // Check marks for each student
        for (Marklist marklist : marklists) {
            marklist.checkMarks();
        }
    }
}