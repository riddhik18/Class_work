//WAP to find Second largest number in an array

import java.util.Scanner;

class SecondLargestArray
{
	public static void main(String[] args)
	{
		int i,maximum;
		
		int[] a=new int[5];  //Array Declaration Syntax
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Five Numbers : ");
		
		//For reading the entered values
		for(i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
		}
		
		//For displaying the entered values
		maximum=a[0];
		
		for(i=1;i<5;i++)
		{   
			if(a[i]>maximum)
			{
				maximum=a[i];
			}
		}
		
		System.out.println("The Maximum value is        = "+maximum);
		
		int second_max=a[0];
		
		for(i=1;i<5;i++)
		{   
			if(a[i]>second_max && a[i]!=maximum)
			{
				second_max=a[i];
			}
		}
		
		System.out.println("The Second Maximum value is = "+second_max);
	}
}