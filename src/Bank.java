public class Bank {
   String bankName;
   Account[] accounts;
    double totalTransactionAmount;
    double totalTransferAmount;
    double transactionFlatFee;
    int transactionPercentFee;

    public Bank(String bankName){
        this.bankName=bankName;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public Account[] getAccounts() {
        return accounts;
    }

    public void setAccounts(Account[] accounts) {
        this.accounts = accounts;
    }

    public double getTotalTransactionAmount() {
        return totalTransactionAmount;
    }

    public void setTotalTransactionAmount(double totalTransactionAmount) {
        this.totalTransactionAmount = totalTransactionAmount;
    }

    public double getTotalTransferAmount() {
        return totalTransferAmount;
    }

    public void setTotalTransferAmount(Float totalTransferAmount) {
        this.totalTransferAmount = totalTransferAmount;
    }

    public double getTransactionFlatFee() {
        return transactionFlatFee;
    }

    public void setTransactionFlatFee(double transactionFlatFee) {
        this.transactionFlatFee = transactionFlatFee;
    }

    public int getTransactionPercentFee() {
        return transactionPercentFee;
    }

    public void setTransactionPercentFee(int transactionPercentFee) {
        this.transactionPercentFee = transactionPercentFee;
    }

    public Bank(String bankName, Account[] accounts, Float totalTransactionAmount, Float totalTransferAmount, float transactionFlatFee, int transactionPercentFee) {
        this.bankName = bankName;
        this.accounts = accounts;
        this.totalTransactionAmount = totalTransactionAmount;
        this.totalTransferAmount = totalTransferAmount;
        this.transactionFlatFee = transactionFlatFee;
        this.transactionPercentFee = transactionPercentFee;
    }


}
