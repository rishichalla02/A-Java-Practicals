Student.java (in the student package):
package student;

public class Student {
    private String name;
    private String rollNumber;

    public Student(String name, String rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public String getRollNumber() {
        return rollNumber;
    }
}
Result.java (in the exam package):
package exam;

public class Result {
    private int marks;

    public Result(int marks) {
        this.marks = marks;
    }

    public int getMarks() {
        return marks;
    }
}
Prac_6_7.java 
import student.Student;
import exam.Result;

public class Prac_6_7 {
    public static void generateMarkSheet(Student student, Result result) {
        System.out.println("Mark Sheet");
        System.out.println("Name: " + student.getName());
        System.out.println("Roll Number: " + student.getRollNumber());
        System.out.println("Marks Obtained: " + result.getMarks());
        // Additional processing for generating the mark sheet
    }

    public static void main(String[] args) {
        // Example usage
        Student student = new Student("John Doe", "2023001");
        Result result = new Result(85);
        generateMarkSheet(student, result);
    }
}