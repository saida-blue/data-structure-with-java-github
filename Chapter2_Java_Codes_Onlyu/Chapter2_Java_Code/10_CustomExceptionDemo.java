// Custom checked exception example based on the insufficient balance scenario.
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class SimpleBankAccount {
    private double balance;

    public SimpleBankAccount(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException(
                "Insufficient balance. Available balance: " + balance
            );
        }
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal must be greater than zero");
        }
        balance -= amount;
        System.out.println("Withdrawal successful. New balance: " + balance);
    }
}

class CustomExceptionDemo {
    public static void main(String[] args) {
        SimpleBankAccount account = new SimpleBankAccount(200);

        try {
            account.withdraw(500);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}
