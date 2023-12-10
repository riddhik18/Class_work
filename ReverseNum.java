//WAP to accept number from  user and do reverse of it


import java.util.Scanner;
class ReverseNum
{
public static void main(String[] args)
{
int num,rem,reverse=0;
Scanner sc=new Scanner(System.in);  
System.out.print("Enter a number: ");
num=sc.nextInt();

while(num>0)
{      
rem=num%10;
reverse=reverse*10+rem;
num=num/10;
}
			
System.out.println("The reverse of the number is:" + reverse);
}
}
