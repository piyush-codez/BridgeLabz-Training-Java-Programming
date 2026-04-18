package OOP_advance.encapsulation_polymorphism_interface_and_abstract;

interface Loanable {
    void applyForLoan(double amount);
    boolean calculateLoanEligibility();
}

abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    // Getters
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    // Deposit Method
    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited successfully.");
    }

    // Withdraw Method
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    abstract double calculateInterest();
}

class SavingsAccount extends BankAccount implements Loanable {

    SavingsAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    double calculateInterest() {
        return getBalance() * 0.04;
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("Loan applied for amount: " + amount);
    }

    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() >= 50000;
    }
}

class CurrentAccount extends BankAccount implements Loanable {

    CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    double calculateInterest() {
        return getBalance() * 0.02;
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("Loan applied for amount: " + amount);
    }

    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() >= 100000;
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        BankAccount[] accounts = {
                new SavingsAccount("SB101", "Rahul", 60000),
                new CurrentAccount("CA102", "Amit", 120000)
        };

        for (BankAccount account : accounts) {
            System.out.println("Account Holder: " + account.getHolderName());
            System.out.println("Account Number: " + account.getAccountNumber());
            System.out.println("Balance: " + account.getBalance());

            double interest = account.calculateInterest();
            System.out.println("Interest: " + interest);

            if (account instanceof Loanable) {
                boolean eligible = ((Loanable) account).calculateLoanEligibility();
                System.out.println("Loan Eligible: " + eligible);
            }

            System.out.println("------------------------");
        }
    }
}
