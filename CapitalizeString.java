//Write a java program to capitalize each word in string.

import java.util.Scanner;    //Scanner is imported
public class CapitalizeString  //class is created
{
    public static void main(String args[])   //main method
    {
        String s1,s1upper;              //variables

        Scanner sc = new Scanner(System.in);  //scanner object created
        System.out.println("Enter a String");  //taking input from user
        s1=sc.nextLine();

        System.out.println("String after capitalize each world ");

        s1upper=s1.toUpperCase();
        System.out.println(s1upper);
    }
}