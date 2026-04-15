package OOP_basics.this_static_and_final;

class BankAccount {
    static String bankName = "State Bank of India";
    static int totalAccounts = 0;

    String accountHolderName;
    final int accountNumber;
    double balance;

    BankAccount(String accountHolderName, int accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        totalAccounts++;
    }

    void displayDetails() {
        System.out.println("Bank Name: " + bankName);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: ₹" + balance);
    }

    static void getTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }

    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Piyush", 1001, 50000);
        BankAccount acc2 = new BankAccount("Rahul", 1002, 30000);

        if (acc1 instanceof BankAccount) {
            acc1.displayDetails();
        }

        System.out.println();

        if (acc2 instanceof BankAccount) {
            acc2.displayDetails();
        }

        System.out.println();
        BankAccount.getTotalAccounts();
    }
}
