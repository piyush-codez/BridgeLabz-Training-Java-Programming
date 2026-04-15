package OOP_basics.this_static_and_final;

class Employee {
    static String companyName = "TCS";
    static int totalEmployees = 0;

    String name;
    final int id;
    String designation;

    Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    void displayEmployeeDetails() {
        System.out.println("Company Name: " + companyName);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Designation: " + designation);
    }

    static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("Piyush", 101, "Software Engineer");
        Employee emp2 = new Employee("Rahul", 102, "Tester");

        if (emp1 instanceof Employee) {
            emp1.displayEmployeeDetails();
        }

        System.out.println();

        if (emp2 instanceof Employee) {
            emp2.displayEmployeeDetails();
        }

        System.out.println();
        Employee.displayTotalEmployees();
    }
}
