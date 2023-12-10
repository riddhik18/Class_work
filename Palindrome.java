//WAP to check whether the number is palindrome or not

import java.util.Scanner;  //import

class Palindrome             //class
{
public static void main(String[]args)     //main method
{
int num,rev=0,rem,a;                         //assigning variables
Scanner sc=new Scanner(System.in);             //scanner object
System.out.println("Enter the number");          //taking input user input
num=sc.nextInt();

a=num;                              //reserving num value in variable
while(num>0)                             //applying while condition
{
rem=num%10;                            //finding remainder
rev=(rev*10)+rem;                      
num=num/10;                            //user input divide by 10
}
		
if(a==rev)                               //check if user input is equal to reverse to print output
{
System.out.println("The number is palindrome");
}
else
{
System.out.println("The number is not palindrome");
}
}
}