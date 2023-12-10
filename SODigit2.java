//Wap to find sum of digits

import java.util.Scanner;
class SODigit2
{
public static void main(String[] args)
{
int num,rem,sum=0;
Scanner sc=new Scanner(System.in);  
System.out.print("Enter a number: ");
num=sc.nextInt();

while(num>0)
{      
rem=num%10;
sum=sum+rem;
num=num/10;
}
			
System.out.println("The sum of digits is:" + sum);
}
}
}
}