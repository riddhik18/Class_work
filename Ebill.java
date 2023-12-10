/* Given an integer U denoting the amount of KWh units of electricity consumed, the task is to calculate the electricity bill with the help of the below charges:
1 to 100 units – Rs. 10/unit

·      100 to 200 units – Rs. 15/unit

·      200 to 300 units – Rs. 20/unit

·      above 300 units – Rs. 25/unit */

 
import java.util.Scanner;
public class Ebill
{
public static void main(String[] args)
{
int Unit,bill;   //Declaration of variables
Scanner sc=new Scanner(System.in);

System.out.println("Enter the amount of Electricity comsumed:-");
Unit=sc.nextInt();   //Value stored in variable

if(Unit<=100)        //Condition
{
System.out.println("The electricity bill is "+ Unit*10);
}
else if(Unit>=100 && Unit<=200)
{
bill=(100*10)+(Unit-100)*15;
System.out.println("The electricity bill is "+ bill);
}
else if(Unit>=200 && Unit<=300)
{
bill=(100*10)+(100*15)+(Unit-200)*20;
System.out.println("The electricity bill is "+ bill);
}
else if(Unit>200 && Unit<=300)
{
bill=(100*10)+(100*15)+(Unit-200)*20;
System.out.println("The electricity bill is "+ bill);
}
}
}

