public class LinearSearch {

    public static void main(String[] args) {
         int arr[] = {1 , 4 ,64,897,4,5};

         int target = 8;

         int index = search(arr, target);
         if (index >= 0) {
             System.out.println("number is at " + index);
         } else {
             System.out.println("number not found");
         }
    }

    public static int search(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}