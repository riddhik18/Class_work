//Accept array of integer with size 10 .Take data from user .Ask user to search an element and find whether that element is present in the given arrray or not .If present then mention index number as well

import java.util.Scanner;
class ArrayFindNum
{
  public static void main(String args[])
   {
     int []arr = new int[10];
     int num;
     Scanner sc= new Scanner(System.in);
     System.out.println("Enter 10 values");
     for(int i =0;i<10;i++)
      {
        arr[i] = sc.nextInt();
      }
     
     System.out.println("Enter value to find");
     num = sc.nextInt();
    for(int i=0;i<10;i++)
      {
        if(arr[i]==num)
        {
          System.out.println("The value is present in an array");
        }
        
     }
   
    System.out.println("The value is not present in an array");
        
     
  }
}