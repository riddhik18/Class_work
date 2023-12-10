//Swap two numbers

import java.util.Scanner;
class SwapNum
{
public static void main(String args[])
{
//variable declaration
int a,b,temp;

Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of A and B");
a=sc.nextInt();
b=sc.nextInt();

System.out.println("Before Swaping:"+a+" "+b);
//Swaping
temp=a;
a=b;
b=temp;
System.out.println("After Swaping:"+a+" "+b);
sc.close();

}
}
