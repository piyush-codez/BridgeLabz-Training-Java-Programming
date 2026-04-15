package OOP_basics.project;

import java.util.Scanner;

class EmployeePayroll {
    String employeeName;
    int employeeId;
    String department;
    String email;
    String password;
    double salary;
    double deductions;
    double taxes;
    double bonus;

    EmployeePayroll(String employeeName, int employeeId, String department,
                    String email, String password, double salary,
                    double deductions, double taxes, double bonus) {
        this.employeeName = employeeName;
        this.employeeId = employeeId;
        this.department = department;
        this.email = email;
        this.password = password;
        this.salary = salary;
        this.deductions = deductions;
        this.taxes = taxes;
        this.bonus = bonus;
    }

    boolean authenticate(String enteredEmail, String enteredPassword) {
        return email.equals(enteredEmail) && password.equals(enteredPassword);
    }

    double calculateNetPay() {
        return salary - deductions - taxes + bonus;
    }

    void displayPayrollDetails() {
        System.out.println("\n----- Employee Payroll Details -----");
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Department: " + department);
        System.out.println("Salary: ₹" + salary);
        System.out.println("Deductions: ₹" + deductions);
        System.out.println("Taxes: ₹" + taxes);
        System.out.println("Bonus: ₹" + bonus);
        System.out.println("Net Pay: ₹" + calculateNetPay());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("----- Employee Registration -----");

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Department: ");
        String department = sc.nextLine();

        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        System.out.print("Create Password: ");
        String password = sc.nextLine();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter Deductions: ");
        double deductions = sc.nextDouble();

        System.out.print("Enter Taxes: ");
        double taxes = sc.nextDouble();

        System.out.print("Enter Bonus: ");
        double bonus = sc.nextDouble();

        EmployeePayroll employee = new EmployeePayroll(
                name, id, department, email, password,
                salary, deductions, taxes, bonus
        );

        sc.nextLine();

        System.out.println("\n----- Employee Login -----");

        System.out.print("Enter Email: ");
        String loginEmail = sc.nextLine();

        System.out.print("Enter Password: ");
        String loginPassword = sc.nextLine();

        if (employee.authenticate(loginEmail, loginPassword)) {
            System.out.println("\nLogin Successful");
            employee.displayPayrollDetails();
        } else {
            System.out.println("\nInvalid Email or Password");
        }

        sc.close();
    }
}
