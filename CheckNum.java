//WAP to print whether the number is positive,negative or zero

import java.util.Scanner;  
class CheckNum
{  
public static void main(String[] args)   
{  
int num;   
Scanner sc = new Scanner(System.in);
    
System.out.println("Enter the number:");  
num = sc.nextInt();  
 
if(num>0)
{
System.out.println("The Number is Positive");  
}
else if(num<0)
{
System.out.println("The Number is Negative"); 
}
else
{
System.out.println("The Number is zero");
}
}
}