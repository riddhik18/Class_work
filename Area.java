//WAP to calculate area of rectangle,square and circle using class and object concept

import java.util.Scanner;

public class AreaofRCS 
{
    double radius,length,breath,side,ans;
    Scanner sc = new Scanner(System.in);

    public void areaofRectangle() 
    {
        System.out.println("Enter the Length: ");
        length = sc.nextDouble();
        System.out.println("Enter the Breath: ");
        breath = sc.nextDouble();
        ans=length*breath;
        System.out.println("Area of Rectangle is: "+ans);
    }

    public void areaofCircle() 
    {
        System.out.println("Enter the radius: ");
        radius = sc.nextDouble();
        ans=3.14*radius*radius;
        System.out.println("Area of Circle is: "+ans);
    }
     
    public void areaofSquare() 
    {
        System.out.println("Enter the side: ");
        side = sc.nextDouble();
        ans=side*side;
        System.out.println("Area of Square is: "+ans);
}
public class Area
{
    public static void main(String[] args)
    {
        AreaofRCS obj=new AreaofRCS();
        obj.areaofRectangle();
        obj.areaofCircle();
        obj.areaofSquare();
        
    }
}
}