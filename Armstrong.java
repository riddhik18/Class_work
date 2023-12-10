//WAP to check whether the number is armstrong number or not

import java.util.Scanner;

class Armstrong
{
public static void main(String[]args)
{
int num,arm=0,rem,a;
Scanner sc=new Scanner(System.in);
System.out.println("Enter three numbers");
num=sc.nextInt();

a=num;
while(num>0)
{
rem=num%10;
arm=(rem*rem*rem)+arm;
num=num/10;
}
		
if(a==arm)
{
System.out.println("The number is armstrong");
}
else
{
System.out.println("The number is not armstrong");
}
}
}