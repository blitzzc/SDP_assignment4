public class BankingFacade {
    private Account account;
    private Security security;
    private Transaction transaction;
    private Notification notification;

    public BankingFacade(double balance, int pin) {
        account = new Account(balance);
        security = new Security(pin);
        transaction = new Transaction();
        notification = new Notification();
    }

    public void depositMoney(double amount, int pin) {
        if (!security.checkPin(pin)) {
            System.out.println("Incorrect PIN.");
            return;
        }

        if (transaction.deposit(account, amount)) {
            notification.sendMessage("Deposit completed.");
        }
    }

    public void withdrawMoney(double amount, int pin) {
        if (!security.checkPin(pin)) {
            System.out.println("Incorrect PIN.");
            return;
        }

        if (transaction.withdraw(account, amount)) {
            notification.sendMessage("Withdrawal completed.");
        }
    }

    public void showBalance() {
        System.out.println("Balance: " + account.getBalance());
    }
}
