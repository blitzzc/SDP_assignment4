public class Main {
    public static void main(String[] args) {
        BankingFacade bank = new BankingFacade(1000, 1234);

        bank.showBalance();
        bank.depositMoney(500, 1234);
        bank.withdrawMoney(200, 1234);

        bank.withdrawMoney(2000, 1234);
        bank.withdrawMoney(100, 1111);
        bank.depositMoney(-50, 1234);

        bank.showBalance();
    }
}
