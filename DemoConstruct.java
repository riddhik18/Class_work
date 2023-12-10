class Emp
{
   String name;
   int age;
  
   public void display()
   {
     System.out.println("Welcome to Employee Details");
   }
   public String data (String name)
   {
     return name;
   }
   public Emp(String name,int age)
   {
     this.name=name;
     this.age=age;
   }
}
public class DemoConstruct
{
  public static void main(String args[])
  {
    Emp e=new Emp("Prachi",20);
    System.out.println(e.name+" "+e.age)
    System.out.println("The name is:"e.data("Sam"));
    e.display();
  }
}