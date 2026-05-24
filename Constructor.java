package day9;

// Bank class (outside main)
class Bank {

    // Instance variable
    double amount;

    // Constructor
    Bank(double amount) {
        this.amount = amount;
    }

    // Withdraw method
    void withdraw(double withdrawalAmount) {

        // Ternary operator
        String message = (withdrawalAmount <= amount)
                ? "Withdrawal successful"
                : "Insufficient balance";

        System.out.println(message);

        if (withdrawalAmount <= amount) {
            amount -= withdrawalAmount;
        }
    }

    // Deposit method
    void deposit(double depositAmount) {
        amount += depositAmount;
    }

    // Display balance
    void displayBalance() {
        System.out.println("After deposit, available balance = " + amount);
    }
}

// Main class (only one public class allowed)
public class Constructor {

    public static void main(String[] args) {

        double initialAmount = 10000;
        double withdrawalAmount = 5000;
        double depositAmount = 5000;

        // Create object
        Bank obj = new Bank(initialAmount);

        obj.withdraw(withdrawalAmount);
        obj.deposit(depositAmount);
        obj.displayBalance();
    }
}