// static int accountIndex = 0;

public class SavingAccount {
    private int balance;
    String userName;
    private int userID;
    private double interestRate;
    private double lengthInMonths;
    static int accountIndex = 0;

    public SavingAccount(int balance, String userName, double interestRate, int length) {
        this.balance = balance;
        this.userName = userName;
        this.interestRate = interestRate;
        this.lengthInMonths = length;
        this.userID = accountIndex++;
    }

    public int deposit(int amount) {
        this.balance += amount;
        return this.balance;
    }
    public void getAccountProperties() {
        System.out.println("Interest amount: " + this.balance*(this.interestRate/100));
        System.out.println("Balance: " + this.balance);
        System.out.println("Length: " + this.lengthInMonths);
    }

    public static void main(String[] args) {
        SavingAccount sa = new SavingAccount(1000, "John", 0.67, 3);
        sa.deposit(1000);
        sa.getAccountProperties();
    }
}
