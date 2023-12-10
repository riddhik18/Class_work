/*
WAP to find Greatest among three number using Nested if.
*/

import java.util.Scanner; // importing scanner class from util package to take input from user.
class GreatestNestedIF
{
	public static void main(String args[])  //main method
	{
	    double num1,num2,num3;  // variables declaration
		Scanner sc=new Scanner(System.in);   // creating scanner object
		
		System.out.println("Enter First Number:");   // Asking user to input value
		num1=sc.nextDouble();         // user input is store in variable
		
		System.out.println("Enter Second Number:"); // Asking user to input value
		num2=sc.nextDouble();            // user input is store in variable
		
		System.out.println("Enter Third Number:"); // Asking user to input value
		num3=sc.nextDouble();                  // user input is store in variable
		
		if(num1>num2) // here we compare two numbers if this condition satisfied then only it is executing
		{
			if(num1>num3) // Here we don't need to compare with num2 because we already checked it.
		    {
				System.out.println(num1+" is Greatest Number among three given numbers.");
		    }
			else
			{
				System.out.println(num3+" is Greatest Number among three given numbers.");
			}
		}
		else if(num2>num3)
		{
			System.out.println(num2+" is Greatest Number among three given numbers.");
		}
		else
		{
			System.out.println(num3+" is Greatest Number among three given numbers.");
		}
		
		sc.close();// closing the scanner class
	}
}