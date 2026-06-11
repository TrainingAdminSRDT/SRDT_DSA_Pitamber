public class FirstLastOccurrence {
      public static int findFirst(int[] arr, int target) {

        int l = 0;
        int r = arr.length - 1;
        int firstIndex = -1;

        while (l <= r) {

            int m = (l + r) / 2;

            if (arr[m] == target) {
                firstIndex = m;
                r = m - 1;
            }
            else if (arr[m] < target) {
                l = m + 1;
            }
            else {
                r = m - 1;
            }
        }

        return firstIndex;
    }
    public static int findLast(int[] arr, int target) {

        int l = 0;
        int r = arr.length - 1;
        int lastIndex = -1;

        while (l<= r) {

            int m = (l + r) / 2;

            if (arr[m] == target) {
                lastIndex = m;
                l = m + 1;
            }
            else if (arr[m] < target) {
                l = m + 1;
            }
            else {
                r = m - 1;
            }
        }

        return lastIndex;
    }

      public static void main(String[] args) {

        int[] arr = {1, 5, 5, 6, 6, 6, 8, 10};

        int target = 6;

        int firstOccurrence = findFirst(arr, target);
        int lastOccurrence = findLast(arr, target);

        System.out.println("Array:");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        System.out.println("Element: " + target);
        System.out.println("First Occurrence Index: " + firstOccurrence);
        System.out.println("Last Occurrence Index: " + lastOccurrence);
    }
}