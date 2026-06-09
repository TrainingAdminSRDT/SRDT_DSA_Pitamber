public class rverseString {

    void reverse(char[] arr, int left, int right) {

        // Base case
        if (left >= right) {
            return;
        }

        // Swap
        char temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

        // Recursive call
        reverse(arr, left + 1, right - 1);
    }

    public static void main(String[] args) {

        String s = "Hello my name is abhishek";

        StringBuilder sb = new StringBuilder(s);
        char[] arr = sb.toString().toCharArray();

        rverseString obj = new rverseString();
        obj.reverse(arr, 0, arr.length - 1);

        System.out.println(new String(arr));
    }
}