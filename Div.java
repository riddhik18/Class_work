//WAP to accept number from user and check if it is divisible by 5 or not

import java.util.Scanner;  
class Div
{  
public static void main(String[] args)   
{  
int num;   
Scanner sc = new Scanner(System.in);
    
System.out.println("Enter the number:");  
num = sc.nextInt();  
 
if(num%5==0 && num%3==0)
{
System.out.println("The Number is divisible by 5 and 3");  
}
else if(num%5==0 || num%3==0)
{
System.out.println("The Number is divisivble by either 5 or 3");
}
else
{
System.out.println("The Number is not divisivble by 5 or 3");
}
}
}