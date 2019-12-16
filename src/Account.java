public class Account {
    static int accountId;
    static double accountBalance;
    String userName;

   public Account(int accountId, String userName, double accountBalance) {
        this.accountId = accountId;
        this.userName = userName;
        this.accountBalance = accountBalance;
    }


    public Account()
    {

        accountId = 0;
        accountBalance = 0;
    }
    public static int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public static double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        if(this.accountBalance<0){
            try {
                throw new Exception("Illegal state");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        this.accountBalance = accountBalance;
    }

//    public void deposit(Transaction transaction){
//       if(transaction.amount!=0){
//           accountBalance+=transaction.amount;
//       }
//    }



}
