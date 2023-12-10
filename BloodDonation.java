/*Wap to accept age and weight and make a decision whether he can donate a blood or not
If the person is above 18 years of age then use another if statement to check if the weight of the person is above 50 or not.*/

import java.util.Scanner;  
class BloodDonation
{  
public static void main(String[] args)   
{  
int age,weight;   
Scanner sc = new Scanner(System.in); //Take input from user
    
System.out.println("Enter your age:");
age = sc.nextInt(); 
System.out.println("Enter your weight:"); 
weight = sc.nextInt();  

 
if(age>18)
{
System.out.println("You can donate the blood");  
if(weight>50)
{
System.out.println("You can donate the blood");  
}
}
else
{
System.out.println("You cannot donate the blood");
}
}
}
