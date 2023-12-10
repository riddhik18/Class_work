//Write a Package MCA which has one class Student. Accept student detail through parameterized constructor. Write display () method to display details. Create a main class which will use package and calculate total marks and percentage

package mca;
public class Student1
{
  public int r_no;
  public String name;
  public int a,b,c;
  int sum=0;
  public void Student1(int roll,String nm,int m1,int m2,int m3)
   {
     r_no = roll;
     name = nm;
     a= m1;
     b=m2;
     c=m3;
     sum= a+b+c;
   }
   public void display()
   {
    System.out.println("Roll_no: "+r_no);  
    System.out.println("Name: "+name);
    System.out.println("----marks----");
    System.out.println("sub1     : "+a);
    System.out.println("sub2     : "+b);
    System.out.println("sub3     : "+c);
    System.out.println("total     : "+sum);
    System.out.println("percentage    : "+sum/3);
    System.out.println("---------");
    }
}