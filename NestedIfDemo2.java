//Wap to check the greated between three numbers using nested if

import java.util.Scanner;  
class NestedIfDemo2
{  
public static void main(String[] args)   
{  
int num1,num2,num3;   
Scanner sc = new Scanner(System.in); //Take input from user
    
System.out.println("Enter the num1:");  
num1 = sc.nextInt();  
System.out.println("Enter the num2:"); 
num2 = sc.nextInt();
System.out.println("Enter the num3:"); 
num3 = sc.nextInt();

if(num1>num2)
{ 
if(num1>num3)
{
System.out.println("The Greater number is" + num1);  
}
}
else
{
if(num2>num3)
{
System.out.println("The Greater number is" + num2);
}
else
{
System.out.println("The Greater number is" + num3);
}
}
}
}