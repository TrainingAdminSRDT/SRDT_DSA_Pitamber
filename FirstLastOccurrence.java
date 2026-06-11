public class FirstLastOccurrence {

    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 2, 3, 4, 5};
        int target = 2;

        int first = -1;
        int last = -1;

        // Find First Occurrence
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                first = i;
                break;
            }
        }

        // Find Last Occurrence
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == target) {
                last = i;
                break;
            }
        }

        System.out.println("First Occurrence: " + first);
        System.out.println("Last Occurrence: " + last);
    }
}