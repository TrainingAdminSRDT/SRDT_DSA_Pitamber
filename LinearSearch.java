public class LinearSearch {

    public static int findIndex(int[] arr, int target) {
       
        for (int i = 0; i < arr.length; i++) {
        
            if (arr[i] == target) {
                return i; 
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
       
        int[] numbers = {45, 12, 89, 7, 23, 56};
        int target = 7;

       
        int resultIndex = findIndex(numbers, target);

       
        if (resultIndex != -1) {
            System.out.println("Element " + target + " found at index: " + resultIndex);
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }
    }
}

