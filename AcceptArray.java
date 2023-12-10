package myarray;
import java.util.Scanner;
public class AcceptArray
{
    public static int[] acceptArray()
    {
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 10 elements in Array but not enter duplicate/same numbers:");
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
        return arr
    }
}