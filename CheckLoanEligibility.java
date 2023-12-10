/*
Q.3)WAP to check whether the person is eligible for getting loan or not.
Condition to grant loan is he should have salary more than 50000 and He should be citizen of 
INDIA.Otherwise Loan can't be given to customer.
*/

import java.util.Scanner;                                       // importing scanner class from util package to take input from user.
class CheckLoanEligibility                                   // Class Name is Given
{
	public static void main(String args[])    // main method
    {
		double salary; // variables declaration
		Scanner sc=new Scanner(System.in); // creating scanner object
		System.out.println("Enter Your Monthly Salary:"); // Asking user to input value
		salary=sc.nextDouble();
		
		if(salary>50000) // Check if the salary is greater than or equal to 50000
		{
			// If the salary is eligible, ask for nationality
			System.out.println("Enter citizen from where you belong:");
		    String nationality=sc.next();
			
			// Check if the nationality is Indian	
			if(nationality.equals("Indian") || nationality.equals("INDIAN") || nationality.equals("indian"))
			{
		      System.out.println("Congratulations!!! You are eligible to get a loan.");
			}
			else
			{
			  System.out.println("Sorry!!! You are not eligible to get a loan beacause you are non-indian."); 
			}
		}
		else // Executes if nationality is Non-Indian	
		{
		  System.out.println("Sorry!!! You are not eligible to get a loan because of low salary.");
		}
		
		sc.close();
    }	
}