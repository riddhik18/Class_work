/* Amar" is HDFC bank customer his Balance is 25000. After  some time He trasfered 11000 amount to his friend "Surya".Print the current balance and find interest value on that amount with interest value 2%  and 12months? */



import java.util.Scanner;
class BalanceAmt
{
public static void main(String args[])
{
int balance = 25000;
int debitedamount = 11000;
int interestamount = balance - debitedamount;
int interestrate = 2;


System.out.print("The interest amount is" + interestamount);

int currentbalance = interestamount + ((interestamount/100)*2);
System.out.print("The total balance is" + currentbalance);
}
}

