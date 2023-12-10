//Swapping of two numbers without using third variable


import java.util.Scanner;
class SwapNum2
{
public static void main(String args[])
{
//variable declaration
int a,b;

Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of A and B");
a=sc.nextInt();
b=sc.nextInt();

System.out.println("Before Swaping:"+a+" "+b);
//Swaping
a=a+b;
b=a-b;
a=a-b;
System.out.println("After Swaping:"+a+" "+b);
sc.close();

}
}
