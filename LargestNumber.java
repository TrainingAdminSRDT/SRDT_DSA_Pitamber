public class LargestNumber {

    public static void main(String[] args) {
        int arr[] = {7777,81,846,5,2,5};
       
        System.out.println(finder(arr));
    }

    public static int finder (int arr[]) {
        int larget = arr[0];

        for(int i = 1 ; i <= arr.length - 1 ; i++ ) {
              if(arr[i] > larget) {
                  larget = arr[i];
              }
              
        }
        
         return larget;
    }
}