import java.util.Random;

public class BankAccount {
    private String accountNumber;
    private double checkingBalance;
    private double savingBalance;
    private static int numberOfAccounts = 0;
    private static int totalAmount = 0;

    // constructor
    public BankAccount() {
        setCheckingBalance(0);
        setSavingBalance(0);
        generateAccount();

        numberOfAccounts++;
        totalAmount += getCheckingBalance() + getSavingBalance();
    }

    // methods
    public void checkingDeposit(double amount) {
        setCheckingBalance(getCheckingBalance() + amount);
        totalAmount += amount;
    }

    public void savingDeposit(double amount) {
        setSavingBalance(getSavingBalance() + amount);
        totalAmount += amount;
    }

    public void checkingWithDraw(double amount) {
        setCheckingBalance(getCheckingBalance() - amount);
        totalAmount -= amount;
    }

    public void savingWithDraw(double amount) {
        setSavingBalance(getSavingBalance() - amount);
        totalAmount -= amount;
    }

    public double totalBalance() {
        return getCheckingBalance() + getSavingBalance();
    }

    public static int totalAccounts() {
        return numberOfAccounts;
    }

    public static double totalAmount() {
        return totalAmount;
    }

    public String disPlayAcct() {
        return accountNumber;
    }

    // set and get
    // checkingBalance
    public void setCheckingBalance(double amount) {
        this.checkingBalance = amount;
        totalAmount += amount;
    }

    public double getCheckingBalance() {
        return this.checkingBalance;
    }
    // savingBalance
    public void setSavingBalance(double amount) {
        this.savingBalance = amount;
        totalAmount += amount;
    }

    public double getSavingBalance() {
        return this.savingBalance;
    }

    // set account number
    private void generateAccount() {
        Random rand = new Random();

        this.accountNumber = "";

        for (int i = 0; i < 10; i++) {
            // get random digit from 0 - 9
            int int_random = rand.nextInt(9);
            // turn the random digit to string
            String s = String.valueOf(int_random);
            // add back to accountNumber
            this.accountNumber += s;
        }
    }

}
