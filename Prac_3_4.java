import java.util.Scanner;

public class Prac_3_4{
    private String name;
    private double salary;

    // Method to get data from the user
    public void getData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter employee name: ");
        name = scanner.nextLine();
        System.out.print("Enter employee salary: ");
        salary = scanner.nextDouble();
    }

    // Method to display data
    public void putData() {
        System.out.println("Employee name: " + name);
        System.out.println("Employee salary: " + salary);
    }

    // Main method to test the Employee class
    public static void main(String[] args) {
        Prac_3_4 employee = new Prac_3_4();
        employee.getData(); // Get data from the user
        employee.putData(); // Display data
    }
}
