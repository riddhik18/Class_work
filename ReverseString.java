/* Q.2)WAP a program to reverse a given String without using reverse() method.*/
import java.util.Scanner;  //Scanner is imported

public class ReverseString  //class is created
{
    public static void main(String[] args)  //main method
    {
        String str, str_Reverse=""; //variables
        Scanner sc = new Scanner(System.in);  //scanner method object created

        System.out.print("Enter the String: ");  //taking input from user
        str = sc.nextLine();

        int len = str.length();

        for(int i=len-1; i>=0; i--)  //using for loop
        {
            str_Reverse = str_Reverse + str.charAt(i);
        }
        System.out.println("Reverse string "+ str_Reverse);
    }
}