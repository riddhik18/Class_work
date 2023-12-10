//WAP program to accept a number and check whether it is less than 100,greater than 50 else greater than 100

import java.util.Scanner;  
class NestedIfDemo
{  
public static void main(String[] args)   
{  
int num;   
Scanner sc = new Scanner(System.in); //Take input from user
    
System.out.println("Enter the number:");  
num = sc.nextInt();  
 
if(num<100)
{
System.out.println("The Number is less than 100");  
if(num>50)
{
System.out.println("The Number is Greater than 50");  
}
}
else
{
System.out.println("The Number is Greater than 100");
}
}
}