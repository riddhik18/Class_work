/* 1)Creating a linked list using the LinkedList class add programming languages
2)Adding elements to the list in multiple ways i.e. direct add and adding elements to specific index 
Accessing elements of linked list using get() and set()
How to remove the elements of the linked list */

import java.util.LinkedList;

public class LinkedListLang
{
     public static void main(String[] args) 
     {
        LinkedList<String> pl = new LinkedList<>();

        pl.add("python");
        pl.add("java");
        pl.add("JavaScript");
        pl.add("React");

        System.out.println("LinkedList: " + pl);

        String str = pl.get(1);
        System.out.println("Element at index 1: " + str);

        pl.set(3, "HTML");
        System.out.println("Add LinkedList: " + pl);

        str = pl.remove(1);
        System.out.println("Removed Element: " + str);

        System.out.printf("Updated LinkedList:%S " , pl);
    }
}