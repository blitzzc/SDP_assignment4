public class Transaction {
    public boolean deposit(Account account, double amount) {
        if (amount <= 0) {
            System.out.println("Amount must be greater than zero.");
            return false;
        }

        account.deposit(amount);
        System.out.println("Deposited: " + amount);
        return true;
    }

    public boolean withdraw(Account account, double amount) {
        if (amount <= 0) {
            System.out.println("Amount must be greater than zero.");
            return false;
        }

        if (amount > account.getBalance()) {
            System.out.println("Not enough money.");
            return false;
        }

        account.withdraw(amount);
        System.out.println("Withdrawn: " + amount);
        return true;
    }
}
