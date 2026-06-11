public class SumOfArray {
    
    
    public static int arraySum(int[] arr, int n) {
        if (n == 0) {          
            return 0;
        }
        
        return arr[n - 1] + arraySum(arr, n - 1);
    }

    
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        
        // arr.length replaces len(arr)
        int result = arraySum(arr, arr.length);
        
        System.out.println("Sum of array elements = " + result);
    }
}
