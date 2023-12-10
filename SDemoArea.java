import java.util.Scanner;

class SDemoArea
{
   static double pi=3.14;
   double area;
   int r;
   Scanner sc=new Scanner(System.in);
   public void accept()
   {
     System.out.println("Enter Radius");
     r=sc.nextInt();
   }

   public void calculate()
   {
      area=pi*r*r;
      System.out.println("The area of circle is"+area);
   }
   
   public static void main(String args[])
   { 
       SDemoArea obj=new SDemoArea();
       obj.accept();
       obj.calculate();
   }
}
