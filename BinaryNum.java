package MyArray;

import java.util.Scanner;

public class BinaryNum {
    public void display() {
        int[] arr = new int[10];
        int mid, num;
        int low = 0;
        int high = 9;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 values ");
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Sorted array: ");
        for (int i = 0; i < 10; i++) {
            for (int j = i + 1; j < 10; j++) {
                int temp = 0;
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.println(arr[i]);
        }
        System.out.println("Enter value to find");
        num = sc.nextInt();
        mid = (low + high) / 2;
        while (low <= high) {
            if (arr[mid] == num) {
                System.out.println("Value is present in array at index: " + (mid + 1));
                break;
            } else if (num > arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
            mid = (low + high) / 2;
        }
        if (low > high) {
            System.out.println("Value is not present in array ");
        }
    }
}