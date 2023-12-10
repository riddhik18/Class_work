/*.Write a Java program that takes an integer as input and checks if it is divisible by 5 and 11. Print "Divisible" if it is divisible by both, and "Not Divisible" otherwise.*/

import java.util.Scanner;  
class Div
{  
public static void main(String[] args)   
{  
int num;   
Scanner sc = new Scanner(System.in);
    
System.out.println("Enter the number:");  
num = sc.nextInt();  
 
if(num%5==0 && num%11==0)
{
System.out.println("The Number is divisible by 5 and 11");  
}
else
{
System.out.println("The Number is not divisivble");
}
}
}