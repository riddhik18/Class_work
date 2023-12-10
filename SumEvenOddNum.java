/*
Write a program that reads a set of integers, and then prints the sum of the even and odd 
integers.
*/
import java.util.Scanner; ;                                                            // importing scanner class from util package to take input from user.
class SumEvenOddNum                                                            // Class Name is Given
{
	public static void main(String args[])
	{
	   int num,sum_even=0,sum_odd=0;                                           // declaration of variable
	   char ans;
	   Scanner sc=new Scanner(System.in);
	   
	   //Do-while loop executes till ans variable is getting yes
	   do 
	   {
			System.out.println("Enter any Number:");
			num=sc.nextInt();
			
			if(num%2==0) // Modulus 2 is used for finding even numbers
			{
				sum_even=sum_even+num;                              //all even number enter sum is calculated 
			}
			else
			{
				sum_odd=sum_odd+num;                                    //all even number enter sum is calculated 
			}
			
			System.out.print("Do you want to continue? (y/n):");
			ans=sc.next().charAt(0);
	   
	   } while(ans=='y' || ans=='Y');
	   
	   System.out.println("Sum of Even Numbers is "+sum_even);
	   System.out.println("Sum of Odd Numbers is "+sum_odd);
	   
	   sc.close(); // Scanner is closed
	
	}

}