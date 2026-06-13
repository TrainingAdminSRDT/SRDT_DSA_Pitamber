public class p2 {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int target = 4;
        int search = Binary(array, target);
        System.out.println("number is at position " + search);
    }

    static int Binary(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1; // not found
    }
}