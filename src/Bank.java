import java.util.ArrayList;

public class Bank {
   String bankName;
   ArrayList<Account> accounts=new ArrayList<>();
    double totalTransactionAmount;
    double totalTransferAmount;
    double transactionFlatFee;
    double transactionPercentFee;
    double sum = 0.0;

    public Bank(){

    }

    public Bank(String bankName, double transactionFlatFee, double transactionPercentFee) {
        this.bankName = bankName;
        this.accounts = accounts;
        this.totalTransactionAmount = totalTransactionAmount;
        this.totalTransferAmount = totalTransferAmount;
        this.transactionFlatFee = transactionFlatFee;
        this.transactionPercentFee = transactionPercentFee;
    }


     public void totalTransferAmount(){
        for(int i=0;i<accounts.size();i++){
            sum+=accounts.get(i).getAccountBalance();
        }
         System.out.println("Total transfer amount is "+sum);
     }

     public void printAccounts(){
        for(int i=0;i<accounts.size();i++){
            System.out.println(accounts.get(i));
        }
     }

}
