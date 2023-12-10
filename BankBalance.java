// Create a bank class with withdraw and deposit methods.assign balance amount and perform the said Operations
import java.util.Scanner;
class Bank
  {
   int balance=50000;
   int Wamount,Damount,Camount;
    
  // System.out.println("Enter 1 for Withdraw and 2 ofr Deposite")  
    
   public void withdraw()
    {
     Scanner sc= new Scanner(System.in);
     System.out.println("Enter amount to Withdraw");
     Wamount=sc.nextInt();
     Camount=balance-Wamount;
     System.out.println("Your current amount is: "+Camount);
     balance=Camount;
   }
  
  public void deposite()
     {
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter amount to Deposite");
      Damount=sc.nextInt();
      Camount=balance+Damount;
      System.out.println("Your current amount is: "+Camount);
      balance=Camount;
    }
}

class BankBalance
 {
   public static void main(String args[])
    {
   Bank b= new Bank();
   b.withdraw();
   b.deposite();
 }
}