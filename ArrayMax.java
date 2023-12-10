//Wap to accept five values from user and find maximum value from them.

import java.util.Scanner;

public class ArrayMax
{
  public static void main(String args[])
   {
     int i,max;
     int[] a=new int[5];          //Array declaration
     Scanner sc = new Scanner (System.in);
     System.out.println("Enter five value");
     for(i=0;i<5;i++)
      {
        a[i]=sc.nextInt();
      }
    System.out.println("maximum value is");
     max= a[0];
     for (i=1;i<5;i++)
      {
       
        if(max<a[i])
          {
             max= a[i];
          }
           
    }
    System.out.println(max);  
  }
 }