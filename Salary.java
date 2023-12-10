/*WAP to accept Salary from the user and make a decision as per given condition
sal>=50000      print "I am happy
sal>=75000  print "I have better life"
sal>=100000 print "My family is happy with me" */



import java.util.Scanner;
class Salary
{
public static void main(String args[])
{
int sal;
Scanner sc=new Scanner(System.in);
System.out.print("Enter your salary:");
sal=sc.nextInt();

if(sal>=50000 && sal<75000) 
{
System.out.println("I am happy");
}
else if(sal>=75000 && sal<100000)
{
System.out.print("I have better life");
}
else if(sal>=100000)
{
System.out.print("My family is happy with me");
}
sc.close();
}
}