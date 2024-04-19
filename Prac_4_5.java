import java.util.Scanner;

class Employee {
    protected String name;
    protected int age;
    protected String designation;

    public Employee(String name, int age, String designation) {
        this.name = name;
        this.age = age;
        this.designation = designation;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Designation: " + designation);
    }
}

class FullTimeEmployee extends Employee {
    private double salary;

    public FullTimeEmployee(String name, int age, String designation, double salary) {
        super(name, age, designation);
        this.salary = salary;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Salary: $" + salary);
    }
}

class PartTimeEmployee extends Employee {
    private double hourlyRate;

    public PartTimeEmployee(String name, int age, String designation, double hourlyRate) {
        super(name, age, designation);
        this.hourlyRate = hourlyRate;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Hourly Rate: $" + hourlyRate);
    }
}

public class Prac_4_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter details for a full-time employee:");
        System.out.print("Name: ");
        String name1 = scanner.nextLine();
        System.out.print("Age: ");
        int age1 = scanner.nextInt();
        scanner.nextLine(); // consume newline
        System.out.print("Designation: ");
        String designation1 = scanner.nextLine();
        System.out.print("Salary: $");
        double salary = scanner.nextDouble();

        System.out.println("\nEnter details for a part-time employee:");
        System.out.print("Name: ");
        scanner.nextLine(); // consume newline
        String name2 = scanner.nextLine();
        System.out.print("Age: ");
        int age2 = scanner.nextInt();
        scanner.nextLine(); // consume newline
        System.out.print("Designation: ");
        String designation2 = scanner.nextLine();
        System.out.print("Hourly Rate: $");
        double hourlyRate = scanner.nextDouble();

        // Creating objects of subclasses
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee(name1, age1, designation1, salary);
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee(name2, age2, designation2, hourlyRate);

        // Displaying employee information
        System.out.println("\nEmployee Information:");
        System.out.println("\nFull-time employee:");
        fullTimeEmployee.display();
        System.out.println("\nPart-time employee:");
        partTimeEmployee.display();

        scanner.close();
    }
}
