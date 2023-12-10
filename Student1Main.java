import mca.Student; // Importing the Student class from the 'mca' package
import java.util.Scanner;

class StudentMain
{
	public static void main(String args[])
	{
		String nm;        // To store student name
		int roll;            // To store student roll no.
		Scanner sc=new Scanner(System.in);
		
		System.out.println("***** Enter Students Details *****");    // Input student's details
		System.out.print("Enter Your Name: ");
		nm=sc.nextLine();
		
		System.out.print("Enter Your Roll No: ");
		roll=sc.nextInt();
		
		System.out.println("Enter Your 3 Subjects Marks out of 100:");
		int m1=sc.nextInt();
		int m2=sc.nextInt();
		int m3=sc.nextInt();
		
		// Create a Student object with the provided details
		Student s=new Student(nm,roll,m1,m2,m3);
		
		// Display the student's details and marks
		s.display();
			
	}
}
