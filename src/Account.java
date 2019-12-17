public class Account {
    static int accountId;
    static double accountBalance;
    String userName;
    public static int getAccountId() {
        return accountId;
    }

    public static double getAccountBalance() {
        return accountBalance;
    }

    public String getUserName() {
        return userName;
    }




    public Account() {
        accountId = 0;
        accountBalance = 0;
    }

    public Account(int accountId, String userName, double accountBalance) {
        this.accountId = accountId;
        this.userName = userName;
        this.accountBalance = accountBalance;
    }

    @Override
    public String toString() {
        return "Account Id: " + this.getAccountId() +
                ", Name: " + this.getUserName();
    }

}
