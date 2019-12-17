import java.io.IOException;
import java.util.Scanner;

public class Mainn {

    static class InsufficientException extends Exception{
        InsufficientException(String s)
        {
            super(s);
        }
    }
    static String[] stmt = new String[100];
  //  static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static Scanner s = new Scanner(System.in);
    static String bankName;
    static double transactionFee;
    static double transactionPercentFee;
    static Bank bank=new Bank(bankName,transactionFee,transactionPercentFee);
    static int transactionId=0;

    static void deposit() throws IOException {

        System.out.print("Enter amount to deposit: ");
        double dep = s.nextDouble();
        if (dep <= 0) {
            System.out.println("Can't deposit nonpositive amount.");
        } else {
            Account.accountBalance += dep;
            stmt[transactionId++]="+"+dep;
            bank.totalTransactionAmount+=transactionFee;
            System.out.println("Transaction Successful!!!\n");
        }
    }

    static void clientReview() throws IOException {

        boolean success = false;
        System.out.print("Enter account ID: ");
        int accId = s.nextInt();
        System.out.print("Enter name: ");
        String userName = s.next();
        System.out.print("Account Balance: ");
        double accountBalance = s.nextDouble();
        Account account = new Account(accId, userName, accountBalance);
        bank.accounts.add(account);
        boolean bool = true;
        while (bool) {
            System.out.println("Enter any of the below options");
            System.out.println("1 –> Deposit");
            System.out.println("2 –> Withdrawl");
            System.out.println("3 –> Statement");
            System.out.println("4 –> Balance");
            int temp = s.nextInt();
            switch (temp) {
                case 1:
                    deposit();
                    break;
                case 2:
                    withdrawl();
                    break;

                case 3: {
                    System.out.println("Bank Statement: ");
                    for (int i = 0; i < transactionId; i++) {
                        System.out.println("Transaction No." + i + " " + stmt[i]);
                    }
                    System.out.println();
                    break;
                }
                case 4: {
                    System.out.printf("Your balance is: %f", Account.accountBalance);
                    System.out.println();
                }
                default: {
                    bool = false;
                }
            }
        }
    }

    static void withdrawl() throws IOException {

        System.out.print("Enter amount to withdraw: ");
        double with = s.nextDouble();
        double percentage=percentFee(with);
        try {
            if (with > Account.accountBalance) {
                throw new InsufficientExc.InsufficientException("Insufficent Balance in your account");
            } else {
                Account.accountBalance -= with;
                stmt[transactionId++]="-"+with;
                bank.totalTransactionAmount+=percentage;
                System.out.println("Transaction Successful!!!\n");
            }
        } catch (InsufficientExc.InsufficientException e) {
            System.out.println(e.getMessage());
            System.out.println("Transaction failure!!\n");
        }
    }


    public static double percentFee(double var) throws IOException {
        var = transactionPercentFee - (var * transactionPercentFee) / 100.0;
        return var;
    }


    public static void bankReview() throws IOException {
        System.out.println("Enter a name of a bank");
        bankName=s.next();
        boolean bool1 = true;
        //while (bool) {
        System.out.println("1.Specify transaction flat fee amount or percent fee amount");
        System.out.println("2.Check bank total transaction fee amount");
        System.out.println("3. Check bank total transfer amount ");
        System.out.println("4. See bank accounts");

        int bankMenu = s.nextInt();
        switch (bankMenu) {
            case 1:
                System.out.println("1.Transaction flat fee amount");
                System.out.println("2.Transaction percent fee amount");

                int choose = s.nextInt();
                switch (choose) {
                    case 1:
                        System.out.println("Enter transaction flat fee value ");
                        transactionFee= s.nextDouble();
                        break;
                    case 2:
                        System.out.println("Enter transaction percent fee value ");
                        transactionPercentFee= s.nextDouble();
                        break;
                    default: {
                        break;
                    }
                }
                break;
            case 2:
                bank.totalTransferAmount();
                break;
            case 3:
                System.out.println(bank.totalTransactionAmount);
                break;
            case 4:
                 bank.printAccounts();
                break;
            default: {
                break;
            }
        }



        Bank bank=new Bank(bankName, transactionFee, transactionPercentFee);

    }

    public static void main(String[] args) throws IOException {

        Bank bank = new Bank(bankName, transactionFee, transactionPercentFee);
        Transaction transaction = new Transaction();

        System.out.println(bank.accounts);
        boolean entryMenu = true;
        while (entryMenu) {
            System.out.println("I am: ");
            System.out.println("1-> Bank employee");
            System.out.println("2-> Client");
            int input = s.nextInt();
            switch (input) {
                case 1:
                    bankReview();
                    break;
                case 2:
                    clientReview();
                    break;
                default: {
                    entryMenu = false;
                    break;
                }

               // bank.totalTransferAmount();
            }
        }
    }
}