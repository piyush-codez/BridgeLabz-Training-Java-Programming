package OOP_advance.encapsulation_polymorphism_interface_and_abstract;

interface Department {
    void assignDepartment(String department);
    void getDepartmentDetails();
}

abstract class Employee {
    private int employeeId;
    private String name;
    private double baseSalary;

    Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // Getters and Setters
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    abstract double calculateSalary();

    public void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Base Salary: " + baseSalary);
    }
}

class FullTimeEmployee extends Employee implements Department {
    private String department;
    private double fixedSalary;

    FullTimeEmployee(int employeeId, String name, double baseSalary, double fixedSalary) {
        super(employeeId, name, baseSalary);
        this.fixedSalary = fixedSalary;
    }

    @Override
    double calculateSalary() {
        return fixedSalary;
    }

    @Override
    public void assignDepartment(String department) {
        this.department = department;
    }

    @Override
    public void getDepartmentDetails() {
        System.out.println("Department: " + department);
    }
}

class PartTimeEmployee extends Employee implements Department {
    private String department;
    private int hoursWorked;
    private double hourlyRate;

    PartTimeEmployee(int employeeId, String name, double baseSalary, int hoursWorked, double hourlyRate) {
        super(employeeId, name, baseSalary);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    double calculateSalary() {
        return hoursWorked * hourlyRate;
    }

    @Override
    public void assignDepartment(String department) {
        this.department = department;
    }

    @Override
    public void getDepartmentDetails() {
        System.out.println("Department: " + department);
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee emp1 = new FullTimeEmployee(101, "Rahul", 30000, 50000);
        Employee emp2 = new PartTimeEmployee(102, "Amit", 10000, 5, 500);

        ((FullTimeEmployee) emp1).assignDepartment("IT");
        ((PartTimeEmployee) emp2).assignDepartment("HR");

        Employee[] employees = {emp1, emp2};

        for (Employee emp : employees) {
            emp.displayDetails();
            System.out.println("Calculated Salary: " + emp.calculateSalary());

            if (emp instanceof Department) {
                ((Department) emp).getDepartmentDetails();
            }

            System.out.println("------------------------");
        }
    }
}
