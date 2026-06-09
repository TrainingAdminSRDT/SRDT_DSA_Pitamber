import java.util.Scanner;
import java.util.Arrays;

public class SearchInRotatedSortedArray {
    
    public static boolean isSortedRotated(int[] arr) {
        int count = 0;
        int n = arr.length;

        // Note: If the array has 0 or 1 element, avoid divide by zero or out of bounds.
        if (n <= 1) return true;

        for (int i = 0; i < n; i++) {
            if (arr[i] > arr[(i + 1) % n]) {
                count++;
            }
        }

        return count == 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Take the number of elements from the user
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        // 2. Take the array elements from the user
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // 3. Sort the array as requested
        Arrays.sort(arr);

        // Print the sorted array
        System.out.println("Sorted Array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // 4. Check the condition
        if (isSortedRotated(arr)) {
            System.out.println("Array is Sorted and Rotated");
        } else {
            System.out.println("Array is Not Sorted and Rotated");
        }

        // Close the scanner to prevent memory leaks
        scanner.close();
    }
}