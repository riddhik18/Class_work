import java.util.Scanner;

class Checksum 
{
public static void main(String[] args)
{
int num;
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number:");
num=sc.nextInt();
       
if (num>50 && num<=100) 
{
System.out.println("You have entered value greater than 50");
} 
else if (num>100) 
{
System.out.println("You have entered value greater than 50");
} 
else
{
System.out.println("you have entered value less than 50");
}
}
}