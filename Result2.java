/*Create a class Student having rool_ number,Name as fields .Create another class Marksdetails to accept 5 subject marks .Apply Single Inheritance to display the result.*/

import java.util.*;                     //import the java package for scanner
class Student                                                        //define the class
{
	String studName;                                                   //variable declaration
	int rollNo,total,marathi,hindi,english,mathematics,science;        
	float percentage;
	Scanner sc=new Scanner(System.in);                    //scanner method object created
	
	public void inputData()                               //taking input from user
	{
		System.out.println("Enter your personal information below");
		System.out.println("Enter your name:");
		studName=sc.nextLine();
		System.out.println("Enter your roll number:");
		rollNo=sc.nextInt();

		System.out.println("Enter your marks as per subject:");
		System.out.println("Enter your marks in marathi:");
		marathi=sc.nextInt();
		System.out.println("Enter your marks in hindi:");
		hindi=sc.nextInt();
		System.out.println("Enter your marks in english:");
		english=sc.nextInt();
		System.out.println("Enter your mathematics:");
		mathematics=sc.nextInt();
		System.out.println("Enter your science:");
		science=sc.nextInt();
	}
}
class MarkDetails extends Student
{
	public void displayresult()             //for displaying result
	{
		total=marathi+hindi+english+mathematics+science;
		percentage=total/5;
		
		System.out.println("!!!Student Personal Information!!!");
		System.out.println("Student Name:"+studName);
		System.out.println("Student Roll Number:"+rollNo);
	
		System.out.println("!!!Student All Subject Marks!!!");
		System.out.println("Marathi Subject Marks:"+marathi);
		System.out.println("Hindi Subject Marks:"+hindi);
		System.out.println("English Subject Marks:"+english);
		System.out.println("Mathematics Subject Marks:"+mathematics);
		System.out.println("Science Subject Marks:"+science);
		System.out.println("Total Obtained Marks:"+total);
		System.out.println("Percentage Of The Marks:"+percentage);
		
	}
}
class Result2 
{
	public static void main(String[]args)         //main method started
	{
		MarkDetails md=new MarkDetails();       //class object is created
		md.inputData();                        //class object method is called
		md.displayresult();
	}
}