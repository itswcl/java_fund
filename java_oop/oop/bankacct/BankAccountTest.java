public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();
        BankAccount account3 = new BankAccount();
        BankAccount account4 = new BankAccount();

        System.out.println(account1);

        account1.setCheckingBalance(1000);
        account1.setSavingBalance(1000);
        account2.setCheckingBalance(1000);
        account2.setSavingBalance(1000);

        System.out.println(account1.totalBalance());

        System.out.println(account1.disPlayAcct());
        System.out.println(account2.disPlayAcct());
        // System.out.println(account3.disPlayAcct());
        // System.out.println(account4.disPlayAcct());

        System.out.println(BankAccount.totalAccounts());
        System.out.println(BankAccount.totalAmount());

    }
}
