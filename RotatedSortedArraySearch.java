public class RotatedSortedArraySearch {
      public static boolean isSortedRotated(int[] arr) {

        int count = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {

            if (arr[i] > arr[(i + 1) % n]) {
                count++;
            }
        }

        return count == 1;
    }

     public static void main(String[] args) {

        int[] arr = {3, 4, 5, 1, 2};

        System.out.println("Array:");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        if (isSortedRotated(arr)) {
            System.out.println("Array is Sorted and Rotated");
        } else {
            System.out.println("Array is Not Sorted and Rotated");
        }
    }
}
