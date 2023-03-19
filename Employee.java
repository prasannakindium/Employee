package Prasanna;

import java.util.Scanner;

class Employee {
    private String firstName;
    private String lastName;
    private int employeeId;
    private int experience;
    private String designation;
    private double salary;

    public Employee(String firstName, String lastName, int employeeId, int experience, String designation, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeId = employeeId;
        this.experience = experience;
        this.designation = designation;
        this.salary = salary;
    }

    // getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public int getExperience() {
        return experience;
    }

    public String getDesignation() {
        return designation;
    }

    public double getSalary() {
        return salary;
    }

    // setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // calculate monthly salary
    public double calculateMonthlySalary() {
        return salary / 12;
    }

    // calculate yearly salary
    public double calculateYearlySalary() {
        return salary;
    }


public class EmployeeMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Employee Details:");
        System.out.print("First Name: ");
        String firstName = input.nextLine();

        System.out.print("Last Name: ");
        String lastName = input.nextLine();

        System.out.print("Employee ID: ");
        int employeeId = input.nextInt();

        System.out.print("Experience (in years): ");
        int experience = input.nextInt();

        System.out.print("Designation: ");
        String designation = input.next();

        System.out.print("Salary: ");
        double salary = input.nextDouble();

        Employee employee = new Employee(firstName, lastName, employeeId, experience, designation, salary);

        // check experience and set designation accordingly
        if (experience >= 3 && experience <= 5) {
            employee.setDesignation("Team Lead");
            employee.setSalary(salary + (salary * 0.1)); // 10% hike for 3 to 5 years experience
        } else if (experience >= 6 && experience <= 10) {
            employee.setDesignation("Manager");
            employee.setSalary(salary + (salary * 0.2)); // 20% hike for 6 to 10 years experience
        } else {
            employee.setDesignation("Employee");
        }

        // display monthly and yearly salary with designation
        System.out.println("\nEmployee Details:");
        System.out.println("Name: " + employee.getFirstName() + " " + employee.getLastName());
        System.out.println("Employee ID: " + employee.getEmployeeId());
        System.out.println("Designation: " + employee.getDesignation());
        System.out.println("Monthly Salary: " + employee.calculateMonthlySalary());
        System.out.println("Yearly Salary: " + employee.calculateYearlySalary());

        input.close();
    }
}
}