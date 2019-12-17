# BankRepo
Simple console application in Java for banking system.
On the starting of project in terminal we have two choises:
1. Bank employee
2. Client

If we choose bank employee we must enter a bank name and then we have a bank menu of four choises
1.Specify transaction flat fee amount or percent fee amount
2.Check bank total transaction fee amount
3. Check bank total transfer amount 
4. See bank accounts
First choise will ask us which type of transaction fee we want to specify.
Secound choise tell us sum of all transactions of clints.
Third choise show us sum of transactions amount
And final choise show list of all bank accounts of clinets.

If our choise was client then:
we enter out account id number, out name and account balance (in code challenge was not specified how to initialise account balance, so I get a value for it as a user input)
Then we will see numeric menu with some options:
1 –> Deposit
2 –> Withdrawl
3 –> Statement
4 –> Balance

1.Deposit will give us a chance to put money on out account.
2.Secount option will give us a chance to take money out from our account
3.Third option show list of all transactions which are numerated and with sign "+" tell us that some money are put on account and sign "-" tell us that money are teken out from account.
4.Final choise will show us balance of account and will step back to previous menu because that is final step of process of checking account.

NOTE: Pressing default value on numeric menus will step back to previous menu.
