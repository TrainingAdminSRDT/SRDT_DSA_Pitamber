public class RotatedSortedArray {
     public static int searchElement(int[] arr, int target) {

        int l = 0;
        int r = arr.length - 1;

        while (l <= r) {

            int m = (l + r) / 2;

            if (arr[m] == target) {
                return m;
            }

            if (arr[l] <= arr[m]) {

                if (target >= arr[l] && target < arr[m]) {
                    r = m - 1;
                } else {
                    l = m + 1;
                }

            } else {

                if (target > arr[m] && target <= arr[r]) {
                    l = m + 1;
                } else {
                    r = m - 1;
                }
            }
        }

        return -1;
    }
public static void main(String[] args) {

        int[] arr = {4, 5, 6, 7, 0, 1, 2};

        int t = 0;

        int index = searchElement(arr, t);

        System.out.println("Array:");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        System.out.println("Element to Search: " + t);

        if (index != -1) {
            System.out.println("Element Found at Index: " + index);
        } else {
            System.out.println("Element Not Found");
        }
    }
}
