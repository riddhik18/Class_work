import Empdetails.Emp;
import java.util.Scanner;

public class DetailOfEmployee
{
         public static void main(String args[])
         {
                 Scanner sc = new Scanner(System.in);
             
                 System.out.println("Enter Employee ID : ");
                 int id = sc.nextInt();

                 System.out.println("Enter Employee Name : ");
                 sc.nextLine();
                 String nm = sc.next();

                 System.out.println("Enter Employee Designation : ");
                 String ds = sc.next();

                 Emp e = new Emp(id , nm, ds);
                 e.display();
          }
}

             
               