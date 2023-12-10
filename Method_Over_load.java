public class Method_Over_load
{
 int add(int num1, int num2)
 {
     return num1 + num2;
 }
 double add(int num1, double num2, int num3)
 {
     return num1+num2+num3;
 }
 int add(int num1,int num2, int num3, int num4)
 {
     return  num1+num2+num3+num4;
 }

    public static void main(String[] args) {
        Method_Over_load obj=new Method_Over_load();
        System.out.println("sum of two number: "+obj.add(10,20));
        System.out.println("sum of three number: "+obj.add(10,5.5,20));
        System.out.println("sum of four number: "+obj.add(1,2,3,20));
    }
}