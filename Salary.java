package day10;

import java.util.Scanner;

// Super class
class User {
    int id;
    String name;

    // Parameterized constructor
    User(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

// Sub class
class Employee extends User {
    double salary;

    // Parameterized constructor
    Employee(int id, String name, double salary) {
        super(id, name);
        this.salary = salary;
    }

    // Method to calculate annual salary
    double calculateAnnualSalary() {
        return salary * 12;
    }
}

// Main class
public class Salary {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        int id = sc.nextInt();
        sc.nextLine();

        String name = sc.nextLine();

        double salary = sc.nextDouble();

        // Create object
        Employee emp = new Employee(id, name, salary);

        // Output
        System.out.println("Annual Salary: " + emp.calculateAnnualSalary());

        sc.close();
    }
}