//Wap to accept five values from user and find minimum value from them.

import java.util.Scanner;

public class ArrayMinimum
{
  public static void main(String args[])
   {
     int i,b;
     int[] a=new int[5];          //Array declaration
     Scanner sc = new Scanner (System.in);
     System.out.println("Enter five value");
     for(i=0;i<5;i++)
      {
        a[i]=sc.nextInt();
      }
    System.out.println("minimum value is");
      b= a[0];
     for (i=1;i<5;i++)
      {
       
        if(b>a[i])
          {
             b= a[i];
          }
           
    }
    System.out.println(b);  
  }
 }