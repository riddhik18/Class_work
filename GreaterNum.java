//WAP to accept three numbers from users and make a desicion which is the greatest number among three

import java.util.Scanner;  
class GreaterNum
{  
public static void main(String[] args)   
{  
int num1, num2, num3;   
Scanner sc = new Scanner(System.in);
    
System.out.println("Enter the first number:");  
num1 = sc.nextInt();  
System.out.println("Enter the second number:");  
num2 = sc.nextInt();  
System.out.println("Enter the third number:");  
num3 = sc.nextInt();  
            
if(num1>num2 && num1>num3)
{
System.out.println("The greater number is" + num1);  
}
else if(num2>num3)
{
System.out.println("The greater number is" + num2); 
}
else
{
System.out.println("The greater number is" + num3);
}
}
}