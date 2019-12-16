public class CreateBankAccount extends Bank{

    public CreateBankAccount(String bankName, Account[] accounts, Float totalTransactionAmount, Float totalTransferAmount, float transactionFlatFee, int transactionPercentFee) {
        super(bankName, accounts, totalTransactionAmount, totalTransferAmount, transactionFlatFee, transactionPercentFee);
    }
    void insert(String bankNm, double totalTransactionAm,
            double totalTransferAm,
            double transFlatFee,
            int transPercentFee){ // input user name, account number and type
        bankName=bankNm;
        totalTransactionAmount=totalTransactionAm;
        totalTransferAmount=totalTransferAm;
        transactionFlatFee=transFlatFee;
        transactionPercentFee=transPercentFee;
    }
    void display_details(){
        System.out.println("Bank Name :" +bankName);
        System.out.println("Total Transaction Amount : "+totalTransactionAmount);


    }
}

