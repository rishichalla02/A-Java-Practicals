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
