import myarray.AcceptArray;
import java.util.Scanner;

public class BinarySearchUsingPackage
{
    public static void main(String args[])
    {
        int[] arr = AcceptArray.acceptArray();
        int target;
        int lb, ub, mid;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++)
        {
            for (int j = i + 1; j < arr.length; j++)
            {
                if (arr[i] > arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("---------------------------");
        System.out.println("The sorted Array elements are: ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]+"   ");
        }

        System.out.println("-------------------------------------------------");
        System.out.println("Enter any number for Search element from Array: ");
        target = sc.nextInt();
        lb = 0;
        ub = 9;
        int flag = 0;
        while (lb <= ub)
        {
            mid = (lb + ub) / 2;
            if (target == arr[mid])
            {
                flag = 1;
                System.out.println(target + " is present in Array at the index " + mid);
                break;
            }
            else if (target > arr[mid])
            {
                lb = mid + 1;
            }
            else
            {
                ub = mid - 1;
            }
        }
        if (flag == 0)
        {
            System.out.println(target + " is not present in Array.");
        }
    }
}