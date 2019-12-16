import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mainn {
    static void deposit() throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));

      //  Account account=new Account();
        System.out.print("Enter amount to deposit: ");
        double dep= Double.parseDouble(bf .readLine());
        Account.accountBalance+=dep;
       // stmt[id++]="+"+dep;
        System.out.println("Transaction Successful!!!\n");
    }
    static void withdrawl() throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter amount to withdraw: ");
        double with= Double.parseDouble(bf.readLine());
        try
        {
            if(with>Account.accountBalance)
            {
                throw new Main.InsufficientException("Insufficent Balance in your account");
            }
            else
            {
                Account.accountBalance-=with;
                //stmt[id++]="-"+with;
                System.out.println("Transaction Successful!!!\n");
            }
        }
        catch (Main.InsufficientException e)
        {
            System.out.println(e.getMessage());
            System.out.println("Transaction failure!!\n");
        }
    }
    public static void main(String[] args) throws IOException {
        Bank bank=new Bank("Stopanska Banka" );
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Transaction transaction=new Transaction();
        System.out.print("Enter account ID: ");
        int accountId= Integer.parseInt(bf.readLine());
        System.out.print("Enter name: ");
        String userName=bf.readLine();
        System.out.print("Account Balance: ");
        double accountBalance= Double.parseDouble(bf.readLine());
        Account account=new Account(accountId, userName,accountBalance);

        boolean bool = true;
        while(bool)
        {
            System.out.println("Enter any of the below options");
            System.out.println("1 –> Deposit");
            System.out.println("2 –> Withdrawl");

            int temp = Integer.parseInt(bf.readLine());
            switch(temp){
                case 1 : deposit();
                    break;
                case 2 : withdrawl();
                    break;
                default:
                {
                    bool = false;
                }
            }
        }
         transaction.seeTransactions(transaction.transactions);

    }
}
