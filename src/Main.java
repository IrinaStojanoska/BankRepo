import java.util.Scanner;
import java.util.Scanner;
import java.util.Random;
import java.lang.Exception;
public class Main {

    static class InsufficientException extends Exception{
        InsufficientException(String s)
        {
            super(s);
        }
    }
    static class Bank{
        static int accno=0;
        int id =0;
        String name;
        Double balance;
        int dep,with;
        String[] stmt = new String[10];
        Scanner in = new Scanner(System.in);
    }
    static class Utilities extends Bank{
        Utilities()
        {
            create();
        }
        void create()
        {
            System.out.print("Enter name: ");
            name = in.nextLine();
            System.out.print("Enter balance amount: ");
            balance = in.nextDouble();
            this.accno=accno;
            accno++;
            stmt[id++]="+"+balance;
            System.out.printf("\n%s your AccNo = %d\n\n",name,accno);
            boolean bool = true;
            while(bool)
            {
                System.out.println("Enter any of the below options");
                System.out.println("1 –> Deposit");
                System.out.println("1 –> Deposit");
                System.out.println("2 –> Withdrawl");
                System.out.println("3 –> Statement");
                System.out.println("4 –> Balance");
                int temp = in.nextInt();
                switch(temp){
                    case 1 : deposit();
                        break;
                    case 2 : withdrawl();
                        break;
                    case 3 :
                    {
                        System.out.println("Bank Statement: ");
                        for(int i=0;i<(id);i++)
                        {
                            System.out.println(stmt[i]);
                        }
                        System.out.println();
                        break;
                    }
                    case 4 :
                    {
                        System.out.printf("Your balance is: %f",balance);
                    }
                    default:
                    {
                        bool = false;
                    }
                }
            }
        }
        void deposit()
        {
            System.out.print("Enter amount to deposit: ");
            dep=in.nextInt();
            balance+=dep;
            stmt[id++]="+"+dep;
            System.out.println("Transaction Successful!!!\n");
        }
        void withdrawl()
        {
            System.out.print("Enter amount to withdraw: ");
            with=in.nextInt();
            try
            {
                if(with>balance)
                {
                    throw new InsufficientException("Insufficent Balance in your account");
                }
                else
                {
                    balance-=with;
                    stmt[id++]="-"+with;

                    System.out.println("Transaction Successful!!!\n");
                }
            }
            catch (InsufficientException e)
            {
                System.out.println(e.getMessage());
                System.out.println("Transaction failure!!\n");
            }
        }
    }
    static class Transaction{
        public static void main(String[] args)
        {
            Utilities u1 = new Utilities();
        }
    }
}
