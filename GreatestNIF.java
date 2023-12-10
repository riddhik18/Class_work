//Write a Program to find greatest among three numbers using Nested If

import java.util.Scanner; //Scanner Class is Imported

class GreatestNIF //Class Name is Given
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in); //Scanner object created to store the Values accepted from user
		
		double num1,num2,num3;
		
	// Input three numbers from the user
		System.out.println("Enter the First Number");
		num1=sc.nextDouble();
		
		System.out.println("Enter The Second Number");
		num2=sc.nextDouble();
		
		System.out.println("Enter The Third Number");
		num3=sc.nextDouble();
		
    // Logic to find the greatest number using nested if-else
		if(num1>num2)
		{
			if(num1>num3)
			{
				System.out.println("Number "+num1+ " Is The Greatest");
			}
			else
			{
				System.out.println("Number "+num3+ " Is The Greatest");
			}
		}
		else if 
		{
			if(num2>num3)
			{
				System.out.println("Number " +num2+ " Is The Greatest");
			}
		    else
			{
				System.out.println("Number "+num3+" Is The Greatest");
			}
		}
		sc.close();  // Close the Scanner
	}
}