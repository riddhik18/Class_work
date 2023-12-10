//WAP to accept score of two team(say India and Pakistan based on score make a decision who won the match

import java.util.Scanner;

class Cricket 
{
         public static void main(String[] args)
   {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter score of India:");
        int indiaScore = sc.nextInt();
        System.out.println("Enter score of Pakistan:");
        int pakistanScore = sc.nextInt();

           if (indiaScore > pakistanScore) 
        {
           System.out.println("India won the match!");
         } 
            else if (indiaScore < pakistanScore) 
         {
            System.out.println("Pakistan won the match!");
          } 
            else
         {
            System.out.println("The match was a tie!");
          }
    }
}