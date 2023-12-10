/* WAP to generate Marksheet of a student based on His personal details and Secured marks.Create PersonalInfo class for accepting student personal information and Create another class MarksInfo for Accepting students marks details and finally create Result class to display all above class information using multilevel Inheritance. */

import java.util.*;
class PersonalInfo
{
   int rollno,phoneno;
   String name,clas,div;
   Scanner sc=new Scanner(System.in);
 
   public void inputData()
   {
     System.out.println("Enter your Name-");
     name=sc.nextLine();
     System.out.println("Enter your Class-");
     clas=sc.nextLine();
     System.out.println("Enter your Div-");
     div=sc.nextLine();
     System.out.println("Enter your Rollno-");
     rollno=sc.nextInt();
     System.out.println("Enter your Phoneno-");
     phoneno=sc.nextInt();
   }
}
class MarksInfo extends PersonalInfo
{
   int sub1,sub2,sub3,sub4,sub5,result;
   Scanner sc=new Scanner(System.in);
   
   public void accept()
   {
   System.out.println("Enter your Subject1 Marks-");
   sub1=sc.nextInt();
   System.out.println("Enter your Subject2 Marks-");
   sub2=sc.nextInt();
   System.out.println("Enter your Subject3 Marks-");
   sub3=sc.nextInt();
   System.out.println("Enter your Subject4 Marks-");
   sub4=sc.nextInt();
   System.out.println("Enter your Subject5 Marks-");
   sub5=sc.nextInt();
   }
}
    
class Calc1 extends MarksInfo
{
    public void calc()
    {
      result=sub1+sub2+sub3+sub4+sub5 % 500 * 100;
    }
}
class Result extends Calc1
{
     public void display()
     {
       System.out.println("Your result is"+result);
     }
}
public class StudentResult
{
   public static void main(String args[])
   {
      Result obj=new Result();
      obj.inputData();
      obj.accept();
      obj.calc();
      obj.display();
   }
}