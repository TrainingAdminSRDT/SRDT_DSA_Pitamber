public class BinarySearch {

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int target=3;
        System.out.println(search(arr, target));
    }

    public static int search(int arr[], int target) {
       int first = 0;
       int last = arr.length - 1;

       while (first <= last) {
           int mid = (first + last) / 2;
           if (arr[mid] == target) {
               return mid;
           }
           if (target > arr[mid]) {
               first = mid + 1;
           } else {
               last = mid - 1;
           }
       }
       return -1;
    }
}