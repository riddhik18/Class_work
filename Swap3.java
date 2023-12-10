//Q.2)WAP to swap two numbers without using third variable

import java.util.Scanner;					//import the java package for scanner
class SwapNumbers 						//define the class
{				
	 int a=0, b=0;				//variable declaration
	
    	public void swap()
	{
       
	Scanner sc=new Scanner(System.in);		//scanner method object created

	System.out.println("Enter the value of a:");	//take inputs from user
	a=sc.nextInt();
        System.out.println("Enter the value of b:");
	b=sc.nextInt();
	System.out.println("Before swapping:");         //Before swapping
        System.out.println("a :" + a);
        System.out.println("b :" + b);

        a = a+b;                                     //logic applied here
	b = a-b;
	a = a-b;

        System.out.println("After swapping:");      //after swapping
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        }
}
        public class Swap3
        {
	     public static void main(String[] args)          //main method started
            {
	     SwapNumbers sn=new SwapNumbers();			//SwapNumbers class object is created
	     sn.swap();	                                    //using SwapNumbers class object swap method is called}
            }							
}
