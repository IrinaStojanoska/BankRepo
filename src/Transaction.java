public class Transaction {
    double amount;
    static int origin_account_id;
    static int result_account_id;
    String transaction_reason;

    public Transaction[] getTransactions() {
        return transactions;
    }

    public void setTransactions(Transaction[] transactions) {
        this.transactions = transactions;
    }

    Transaction []transactions;
    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public static int getOrigin_account_id() {
        return origin_account_id;
    }

    public void setOrigin_account_id(int origin_account_id) {
        this.origin_account_id = origin_account_id;
    }

    public static int getResult_account_id() {
        return result_account_id;
    }

    public void setResult_account_id(int result_account_id) {
        this.result_account_id = result_account_id;
    }

    public String getTransaction_reason() {
        return transaction_reason;
    }

    public void setTransaction_reason(String transaction_reason) {
        this.transaction_reason = transaction_reason;
    }

    public Transaction(){

    }

    public Transaction(float amount, int origin_account_id, int result_account_id, String transaction_reason) {
        this.amount = amount;
        this.origin_account_id = origin_account_id;
        this.result_account_id = result_account_id;
        this.transaction_reason = transaction_reason;
    }

    public int length(){
        int counter=0;
       for(int i=0;i<transactions.length;i++){
           counter++;
       }
       return counter;
    }

    public void print(){
        for(int i=0;i<transactions.length;i++){
            System.out.println(transactions[i]);
        }
    }

    public void seeTransactions(Transaction[] allTransactions){
        int ID = Account.getAccountId();
        int oriID=Transaction.getOrigin_account_id();
        int resID=Transaction.getResult_account_id();
        //Transaction[] accountTransactions;
        //int finalAccIter=0;
        for(int i=0;i<allTransactions.length();i++){
            if(ID==oriID || ID==resID){
                //accountTransactions[finalAccIter]=allTransactions;
                allTransactions.print();
            }
        }

    }

}
