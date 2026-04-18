package OOP_advance.Inheritance;

// Superclass
class BankAccount {
    int accountNumber;
    double balance;

    // Constructor
    BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
}

// SavingsAccount subclass
class SavingsAccount extends BankAccount {
    double interestRate;

    // Constructor
    SavingsAccount(int accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    void displayAccountType() {
        System.out.println("Account Type: Savings Account");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

// CheckingAccount subclass
class CheckingAccount extends BankAccount {
    double withdrawalLimit;

    // Constructor
    CheckingAccount(int accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    void displayAccountType() {
        System.out.println("Account Type: Checking Account");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println("Withdrawal Limit: " + withdrawalLimit);
    }
}

// FixedDepositAccount subclass
class FixedDepositAccount extends BankAccount {
    int depositYears;

    // Constructor
    FixedDepositAccount(int accountNumber, double balance, int depositYears) {
        super(accountNumber, balance);
        this.depositYears = depositYears;
    }

    void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println("Deposit Period: " + depositYears + " years");
    }
}

// Main class
public class BankSystem {
    public static void main(String[] args) {

        SavingsAccount savings = new SavingsAccount(1001, 50000, 4.5);
        CheckingAccount checking = new CheckingAccount(1002, 30000, 10000);
        FixedDepositAccount fixedDeposit = new FixedDepositAccount(1003, 100000, 5);

        System.out.println("----- Savings Account Details -----");
        savings.displayAccountType();

        System.out.println("\n----- Checking Account Details -----");
        checking.displayAccountType();

        System.out.println("\n----- Fixed Deposit Account Details -----");
        fixedDeposit.displayAccountType();
    }
}
