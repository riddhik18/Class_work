/* MR.XYZ wants to buy a car of his color choice.But In showRoom there are different colors car available(black,white,Red,blue).Greet the customer with thae brand and color he purchased.
Basic info(Cust_name,brand,color) */


import java.util.Scanner;

class CarShowroom 
{
public static void main(String[] args) 
{
String cust_name,car_brand,color;
Scanner sc = new Scanner(System.in);
System.out.print("Enter your name: ");
cust_name = sc.nextLine();
System.out.print("Enter car brand: ");
car_brand = sc.nextLine();
System.out.print("Enter car color (black, white, red, blue): ");
color = sc.nextLine();

switch(color)
{
case "blue":
System.out.println(cust_name +",Congratulations!!you purchased blue Audi");
break;
case "black":
System.out.println(cust_name +",Congratulations!!you purchased black Audi");
break;
case "white":
System.out.println(cust_name +",Congratulations!!you purchased white Audi");
break;
case "red":
System.out.println(cust_name +",Congratulations!!you purchased red Audi");
break;

default:
System.out.println("sorry!! "+color+"car is not available");
break;
}
}
}
