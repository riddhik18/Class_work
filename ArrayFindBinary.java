import java.util.Scanner;

public class ArrayFindBinary
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int arr1[]=new int[10];
		int start=0;
		int end=arr1.length-1;
		int position;
		int find;
		System.out.println("Enter 10 numbers");
		
		for(int i=0; i<10; i++)
		{
			int input=sc.nextInt();
			arr1[i]=input;
		}
		System.out.println("The given number in sorted order: ");
		for(int i=0; i<=9; i++)
		{
			int temp=0;
			for(int j=i+1; j<=arr1.length-1; j++)
			{
				if(arr1[j]<arr1[i])
				{
					temp=arr1[i];
					arr1[i]=arr1[j];
					arr1[j]=temp;
				}
			}
			System.out.println(arr1[i]);
		}
		System.out.println("Enter the number you want to find: ");
		find=sc.nextInt();
		while(start<=end)
		{
			int mid=((start+end)/2);
			if(arr1[mid]==find)
			{
				position=mid;
				System.out.println("The Element is present at "+position);
				break;
			}
			else if(arr1[mid]<find)
			{
				start=mid+1;
			}
			else
			{
				end=mid-1;
			}
		}
	}
}