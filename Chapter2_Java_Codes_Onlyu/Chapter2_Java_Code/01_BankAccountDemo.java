// Inheritance example based on the Chapter 2 bank account slides.
class BankAccount {
    private String accountNumber;
    protected double balance;

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Rejected: deposit must be more than 0");
            return;
        }
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {
    private double minimumBalance = 50;

    public double getMinimumBalance() {
        return minimumBalance;
    }
}

class CurrentAccount extends BankAccount {
    private double overdraftLimit = 200;

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public double availableFunds() {
        return balance + overdraftLimit;
    }
}

class BankAccountDemo {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount();
        savings.setAccountNumber("SAV-1001");
        savings.deposit(300);
        savings.deposit(-20);

        CurrentAccount current = new CurrentAccount();
        current.setAccountNumber("CUR-2001");
        current.deposit(150);

        System.out.println("Savings account: " + savings.getAccountNumber());
        System.out.println("Savings balance: " + savings.getBalance());
        System.out.println("Minimum balance: " + savings.getMinimumBalance());

        System.out.println("Current account: " + current.getAccountNumber());
        System.out.println("Current balance: " + current.getBalance());
        System.out.println("Available funds: " + current.availableFunds());

        System.out.println("Savings IS-A BankAccount: " + (savings instanceof BankAccount));
        System.out.println("Savings IS-A Object: " + (savings instanceof Object));
    }
}
