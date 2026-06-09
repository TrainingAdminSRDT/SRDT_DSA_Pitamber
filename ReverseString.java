public class ReverseString {

    void reverse(char[] arr, int left, int right) {
         if (left >= right) {
            return;
        }
        char temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
         reverse(arr, left + 1, right - 1);
    }
     public static void main(String[] args) {
         String str = "Hello my name is tejas";
          char[] arr = str.toCharArray();
           ReverseString obj = new ReverseString();
        obj.reverse(arr, 0, arr.length - 1);
         System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + new String(arr));
    }
}