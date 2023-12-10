//Xaviers College Selection for Science Stream on the basis of eligibility //
 
import java.util.Scanner;
public class Stream
{
public static void main(String[] args)
{
int Eng,Maths,Science;
Scanner sc=new Scanner(System.in);

System.out.println("Enter the english marks:-");
Eng=sc.nextInt();
System.out.println("Enter the maths marks:-");
Maths=sc.nextInt();
System.out.println("Enter the Science marks:-");
Science=sc.nextInt();

if(Eng==Maths && Science>=80)
{
System.out.println("Eligible for pure Science");
}
else if(Eng==Science && Maths>=60)
{
System.out.println("Eligible for Bio. Science");
}
else if(Eng==Maths && Science>=60)
{
System.out.println("Eligible for commerce");
}
else
{
System.out.println("not Eligible for only Stream");
}
}
}