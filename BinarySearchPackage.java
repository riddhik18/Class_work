
package binarysearchpackage;
//importing the pacakge
import MyArray.*;
import java.util.Scanner;


public class BinarySearchPackage {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        //creating object of the class 
        CreateArray obj = new CreateArray();
        
        obj.newArray();
        
        
        
        int start = 0;
        int end = obj.arr1.length -1;
        int position ; 
        int find;
        
        System.out.println("enter the number you want to find : ");
        find = sc.nextInt();

        while(start<=end)
        {
            int mid = ((start+end)/2);
            
            if(obj.arr1[mid] == find)
            {
                position = mid;
                System.out.println("the element is present at "+position);
                break;
            }
            else if(obj.arr1[mid]<find)
            {
                start = mid+1;
            }
            else
            {
                end = mid-1;
            }
            
        }
    }
    
}