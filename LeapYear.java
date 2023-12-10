//Write a Java program that takes a year from the user and prints whether it is a leap year or not.

import java.util.Scanner;  
class LeapYear
{  
public static void main(String[] args)   
{  
int year;   
Scanner sc = new Scanner(System.in);
    
System.out.println("Enter the year:");  
year = sc.nextInt();  
 
if(year%400==0)
{
System.out.println("The year is leap year");  
}
else if(year%4==0 && year%100!=0)
{
System.out.println("The year is leap year");
}
else
{
System.out.println("The year is not leap year");
}
}
}
