public class Transaction {
    double amount;
    static int origin_account_id;
    static int result_account_id;
    String transaction_reason;



    public Transaction() {

    }

    public Transaction(float amount, int origin_account_id, int result_account_id, String transaction_reason) {
        this.amount = amount;
        this.origin_account_id = origin_account_id;
        this.result_account_id = result_account_id;
        this.transaction_reason = transaction_reason;
    }


}
