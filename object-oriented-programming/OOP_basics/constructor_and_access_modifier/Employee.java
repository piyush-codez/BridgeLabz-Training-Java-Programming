package OOP_basics.constructor_and_access_modifier;

class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}

class Manager extends Employee {
    String managerName;

    Manager(int employeeID, String department, double salary, String managerName) {
        super(employeeID, department, salary);
        this.managerName = managerName;
    }

    void displayManagerDetails() {
        System.out.println("Manager Name: " + managerName);
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: ₹" + getSalary());
    }

    public static void main(String[] args) {
        Manager manager1 = new Manager(101, "IT", 75000, "Piyush");

        manager1.displayManagerDetails();

        manager1.setSalary(85000);

        System.out.println();
        System.out.println("After Salary Update:");
        manager1.displayManagerDetails();
    }
}
