/*.Write a Java program to create an ArrayList of integers and perform the following operations:
a. Add elements to the ArrayList.
b. Remove an element from a specific index.
c. Update an element at a specific index.*/

import java.util.*;
public class ArrayListExample2
{
  public static void main(String args[])
  {
   ArrayList<Integer> list=new ArrayList<Integer>(); //Creat arraylist
   list.add(12);           //adding objects
   list.add(34);
   list.add(45);
   list.add(15);
   
   // Printig arratlist
  System.out.println(list);
  
  // to access perticual value
  
  int s = list.get(1);
  System.out.println("Element at index 1:"+s);
 
  //modify arraylist
   list.set(2,5);
   System.out.println("Modified array: "+list);
  
 //remove element
  int int1=list.remove(2);
 System.out.println("Updated Arraylist :"+list);
 System.out.println("Removed element :"+int1);
}
}