/* Write a Java program that prompts the user to enter a positive integer and calculates its factorial using a while loop. The program should display the factorial as the output */

import java.util.Scanner;  //import

class Factorial             //class
{
public static void main(String[]args)     //main method
{
long fact=1,i=1,num;                         //assigning variables
Scanner sc=new Scanner(System.in);             //scanner object
System.out.println("Enter the number");          //taking input user input
num=sc.nextInt();

while(i<=num)                             //applying while condition
{
fact= fact*i;
i++;                      //value of i is increased by 1
}
System.out.println("The factorial is:" + fact);
}
}
