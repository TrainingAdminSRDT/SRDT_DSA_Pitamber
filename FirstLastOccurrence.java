public class FirstLastOccurrence {

    public static int firstOccurrence(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static int lastOccurrence(int[] arr, int target) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 5, 5, 7, 8};
        int target = 5;

        System.out.println("First Occurrence: " + firstOccurrence(arr, target));
        System.out.println("Last Occurrence: " + lastOccurrence(arr, target));
    }
}