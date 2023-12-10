//Create a package Empdetails.Create a class Emp which has fields as Empid,Empname,Empdesignation ,Accept details from user and display the same

package Empdetails;
public class Emp
{
     int empId;
     String empName,empDesignation;
    
     public Emp(int id, String name, String desig)
     {
             empId = id;
             empName = name;
             empDesignation = desig;
     }
     public void display()
     {
          System.out.println(" Employee Details ");
          System.out.println("------------------");
          System.out.println("Employee ID : " + empId);
          System.out.println("Employee Name : " + empName);
          System.out.println("Employee Designation : " + empDesignation);
          System.out.println("------------------");
     }
}