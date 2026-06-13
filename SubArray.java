public class SubArray {

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        sub(arr);
    }

    public static int sub (int arr[]) {
       
        for (int i = 0 ; i <= arr.length - 1 ; i++) {
          
            for (int j = 0 ; j < arr.length ; j++) {

                for (int k = i ; k <= j ; k++ ) {

                    System.out.print(arr[k]);
                }
                System.out.println("");
            }
        }
    return -1;
    }
}