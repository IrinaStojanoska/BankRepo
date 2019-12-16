public class CreateAccount extends Account {
    CreateAccount(int accId, String usrName,int accBalance){ // pass name and account type
        accountId=accId;
        userName=usrName;
        accountBalance=accBalance;
    }
    CreateAccount(){
        super();
    }
    void insert(int accId, String usrName,int accBalance){ // input user name, account number and type
        accountId=accId;
        userName=usrName;
        accountBalance=accBalance;
    }
    void display_details(){
        System.out.println("Name :" +userName);
        System.out.println("Account ID Number : "+accountId);
        System.out.println("Account Balance : "+accountBalance);

    }
}
