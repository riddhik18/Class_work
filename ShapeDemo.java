/*Question 3: Create a superclass called "Shape" with properties like "numSides" and "color". Create three subclasses "Triangle", "Square", and "Circle" that inherit from "Shape" and have additional properties like "sideLengths" for triangle and square, and "radius" for the circle. Write a Java program to display the details of a triangle, a square, and a circle.*/

import java.util.Scanner;

class Shape
{
	String colour;
	void displayDetails()
	{
		System.out.println("Colour of the Shape: " + colour);
	}
}
class Triangle extends Shape
{
	double length,length1,length2;
	String colour;
	void getInput()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Lengths of your Triangle");
		length=sc.nextDouble();	
		length1=sc.nextDouble();
		length2=sc.nextDouble();
		sc.nextLine();
		System.out.println("Enter the Colour of your Triangle");
		colour=sc.nextLine();
	}
	@Override
	void displayDetails()
	{
		System.out.println("The length of the sides is: "+length+", "+length1+", "+length2);
		System.out.println("The Colour of your Shape is: "+colour);
		System.out.println("The number of sides of your shape is 3");
	}
}
class Square extends Shape
{
	double length,length1,length2,length3;
	String colour;
	void getInput()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Side Length of your Square");
		length=sc.nextDouble();	
		length1=sc.nextDouble();
		length2=sc.nextDouble();
		length3=sc.nextDouble();
		sc.nextLine();
		System.out.println("Enter the Colour of your Square");
		colour=sc.nextLine();
	}
	@Override
	void displayDetails()
	{
		System.out.println("The length of the sides is: "+length+", "+length1+", "+length2+", "+length3);
		System.out.println("The Colour of your Shape is: "+colour);
		System.out.println("The number of sides of your shape is 4");
	}
}
class Circle extends Shape
{
	double radius;
	String colour;
	void getInput()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius of your Circle");
		radius=sc.nextDouble();	
		sc.nextLine();
		System.out.println("Enter the Colour of your Circle");
		colour=sc.nextLine();
	}
	@Override
	void displayDetails()
	{
		System.out.println("The length of the sides is: "+radius);
		System.out.println("The Colour of your Shape is: "+colour);
		System.out.println("The number of sides of your shape is 0");
	}
}
class ShapeDemo
{
	public static void main(String args[])
	{
		Triangle t=new Triangle();
		t.getInput();
		Square s=new Square();
		s.getInput();
		Circle c=new Circle();
		c.getInput();
		
		System.out.println();
		System.out.println("Triangle Details:");
		t.displayDetails();
		System.out.println("----------------------");

		System.out.println("Square Details:");
		s.displayDetails();
		System.out.println("----------------------");

		System.out.println("Circle Details:");
		c.displayDetails();
	}
}