//WAP to accept number from user and generate table of it.

import java.util.Scanner;  
class Table
{  
public static void main(String[] args)   
{  
int num,i;
Scanner sc = new Scanner(System.in);

System.out.println("Enter the number:");  
num = sc.nextInt();  

System.out.println("Table of" + num + "is :");
for(i=1;i<=10;i++)    //i=i+1
{
System.out.println(num + "*" + i + "=" + (num*i));
}
}
}