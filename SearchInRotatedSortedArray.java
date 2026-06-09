import java.util.Scanner;
import java.util.Arrays;

public class SearchInRotatedSortedArray {
    
    public static boolean isSortedRotated(int[] arr) {
        int count = 0;
        int n = arr.length;

        
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

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

       
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

       
        Arrays.sort(arr);

      
        System.out.println("Sorted Array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        if (isSortedRotated(arr)) {
            System.out.println("Array is Sorted and Rotated");
        } else {
            System.out.println("Array is Not Sorted and Rotated");
        }

       
        scanner.close();
    }
}