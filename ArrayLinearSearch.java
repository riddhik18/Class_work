//Accept array of integer with size 10 .Take data from user .Ask user to search an element and find whether that element is present in the given arrray or not .If present then mention index number as well

import java.util.Scanner;

class ArrayLinearSearch
{
  public static void main(String args[])
   {
     int []array = new int[10];
     int num,count,i;
     Scanner sc= new Scanner(System.in);
     System.out.println("Enter 10 values");
     for(int i =0;i < array.length;i++)
      {
        array[i] = sc.nextInt();
      }
     
     System.out.println("Enter value to find");
     num = sc.nextInt();

     for(int i=0;i<10;i++)  //Compare each element of array with num
      {
        if(array[i]==num)
        {
          System.out.println(num + " is present in an array"+i);
          break;
        }
        
     }
    if(i == 10)
    {
    System.out.println(num + " is not present in an array");
    }
}
}