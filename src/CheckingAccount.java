public class CheckingAccount {
    private int balance;
    String userName;
    private int userNum;
    static int accountIndex = 0;

    public CheckingAccount(int balance, String userName) {
        this.balance = balance;
        this.userName = userName;
        userNum = accountIndex++;
    }

    public int deposit(int amount) {
        this.balance += amount;
        return this.balance;
    }
    public int withdraw(int amount) {
        if (this.balance < amount) {
            System.out.println("Your balance is not enough to withdraw this amount.");
            return 0;
        } else {
            this.balance -= amount;
            System.out.println(this.balance);
            return this.balance;
        }
    }
    public int transaction(int amount, CheckingAccount target) {
        if (this.balance < amount) {
            System.out.println("Your balance is not enough to perform this transaction.");
            return 0;
        } else {
            System.out.println("Transaction success");
            System.out.println("Sent: " + amount + " to " + "\nRecipient Name: " + target.userName + "\nRecipient userID: " + target.userNum);
            this.balance -= amount;
            target.balance += amount;
            return (int)target.balance;
        }
    }

    public static void main(String[] args) throws Exception {
        CheckingAccount Account1 = new CheckingAccount(1000, "Tom");
        CheckingAccount Account2 = new CheckingAccount(1000, "Jane");
        // System.out.println(accountIndex);

        Account1.withdraw(100);
        Account2.deposit(2000);
        Account1.transaction(100, Account2);
    }
}
