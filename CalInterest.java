/* WAP to  calculate interest rate of Fixed deposite or Saving intertest based on choice provided by user whether he wants to keep money for fixed deposite or saving .Interest Rate for fixed Deposit is 7 % and for saving it is 3.5% */

import java.util.Scanner;
class CalInterest
{
public static void main(String args[])
{
int ch;
double time,si,principle_amt;
       
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Principle Amount"); 
principle_amt=sc.nextLine();
System.out.println("Enter the time period in years");
time=sc.nextLine();
System.out.println("Enter Where you want to keep youe money, fixed_deposite or in Saving");
System.out.println("Choose from given options");
System.out.println("Write 1 for savings and 2 for Fixed Deposit");
ch=sc.nextInt();
switch(ch)
{
case "1":
                                          
si=(amount*7*time)/100;
System.out.println("Enterest rate for Saving is "+si);
break;
 
case "saving":
                                          
si=(amount*3.5*time)/100;
System.out.println("Enterest rate for Fixed Deposit is "+si);
break;
                          
default:
                             
System.out.println("Enter valid input");
break;
}
}
}
