/* Write a program that reads a set of integers, and then prints the sum of the even and odd integers. */


import java.util.Scanner;  // importing scanner class from util package to take input from user.
public class EvenOddInt     //// Class Name is Given
{

    public static void main(String[] args) //main method
{

        Scanner sc = new Scanner(System.in);  //creating scanner object

        int number, choice, evenSum = 0, OddSum = 0; //variable declaration
        
        //Do-while loop executes till ans variable is getting yes
        do {

            System.out.print("Enter the number ");

            number = sc.nextInt();



            if (number % 2 == 0) {   // Modulus 2 is used for finding even numbers

                evenSum += number;   

            } else {

                OddSum += number;

            }

            System.out.println("Do you want to continue? Press 1 for yes or 0 for no");

            choice = sc.nextInt();

        } while (choice == 1);

        System.out.println("Sum of even numbers: " + evenSum);

        System.out.println("Sum of odd numbers: " + OddSum);

    }

}
