
public class Day30 {

    public static void main(String[] args) {
        BankAccount account = new BankAccount("Rahul", 10000);
        account.displayAccountDetails();
        account.deposit(2000);
        account.withdraw(3000);
        account.withdraw(15000);
        account.deposit(-500);
        account.displayAccountDetails();

        // account.balance = 50000;
        // I am getting a compile time error saying Error: The field BankAccount.balance is not visible because balance is a private field in the BankAccount class and can only be accessible in that BankAccount Class
    }

}

class BankAccount {

    private String accountHolder;
    private double balance;

    BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;

        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Invalid initial balance.");
            this.balance = 0;
        }
    }

    public String getAccountHolder() {
        return this.accountHolder;
    }

    public double getBalance() {
        return this.balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited: " + amount);
        } else {
            System.out.println("Deposit failed: Amount must be greater than zero.");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal failed: Amount must be greater than zero.");
            return;
        } else if (amount > balance) {
            System.out.println("Withdrawal failed: Insufficient balance.");
            return;
        }
        balance -= amount;
        System.out.println("Successfully withdrawn: " + amount);

    }

    public void displayAccountDetails() {
        System.out.println("Account Holder: " + getAccountHolder());
        System.out.println("Balance: " + getBalance());
    }

}
