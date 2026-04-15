package OOP_basics.class_and_object_problems;

class BankAccount {
    String accountHolder;
    long accountNumber;
    double balance;


    BankAccount(String accountHolder, long accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }


    void deposit(double amount) {
        balance += amount;
        System.out.println("₹" + amount + " deposited successfully.");
    }


    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("₹" + amount + " withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }


    void displayBalance() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: ₹" + balance);
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Piyush", 1234567890L, 5000);

        account1.displayBalance();

        account1.deposit(2000);
        account1.displayBalance();

        account1.withdraw(3000);
        account1.displayBalance();

        account1.withdraw(5000);
    }
}
