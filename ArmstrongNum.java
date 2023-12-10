//program to check armstrong number 

import java.util.Scanner;						//import scanner class from util package
class Armstrong   						       //class started
{  
  int OriginalNum,number, arm= 0,rem;  					//variable declaration
  Scanner sc=new Scanner(System.in);
  public void getinfo()
    {
      System.out.println("Enter Three number");
                number=sc.nextInt();
                OriginalNum=number;
    }

  public void display()
   {
                while(number>0)                                     //while loop checks the condition of number is not equal to 0
	         {  
		rem = number % 10;  					//logic applied here	
		arm= (rem*rem*rem)+arm;  		
		number = number/10;  					
	        } 
           if(arm==OriginalNum)                                                 //if-else applied to check the armstron number or not
              { 
		System.out.println(OriginalNum+" is armstrong number");   
              }
           else
             {
               System.out.println("number is not armstrong number");
             }  
 } 
}  
class ArmstrongNum 
   {
    public static void main(String[] args)   			 //main method started
      {	 
        Armstrong a = new Armstrong();
        a.getinfo();
        a.display();
      }
 }









