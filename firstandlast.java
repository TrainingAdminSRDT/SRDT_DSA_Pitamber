public class firstandlast {
    public static int firstOccurrence(int[] arr, int low, int high, int target) {
        if (low > high) {
            return -1;
        }
        int mid = low + (high - low) / 2;
        if (arr[mid] == target) {
            int leftResult = firstOccurrence(arr, low, mid - 1, target);
            return (leftResult == -1) ? mid : leftResult;
        }
        if (arr[mid] < target) {
            return firstOccurrence(arr, mid + 1, high, target);
        }
        return firstOccurrence(arr, low, mid - 1, target);
    }
    public static int lastOccurrence(int[] arr, int low, int high, int target) {

        if (low > high) {
            return -1;
        }
        int mid = low + (high - low) / 2;
        if (arr[mid] == target) {
            int rightResult = lastOccurrence(arr, mid + 1, high, target);
            return (rightResult == -1) ? mid : rightResult;
        }
        if (arr[mid] < target) {
            return lastOccurrence(arr, mid + 1, high, target);
        }
        return lastOccurrence(arr, low, mid - 1, target);
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3, 4, 5};
        int first = firstOccurrence(arr, 0, arr.length - 1, 2);
        int last = lastOccurrence(arr, 0, arr.length - 1, 2);
        System.out.println("First Occurrence: " + first);
        System.out.println("Last Occurrence: " + last);
    }
}
