class Solution {
    public static void countingSort(int[] arr) {

        int max = arr[0];

        for (int num : arr) {
            max = Math.max(max, num);
        }

        int[] count = new int[max + 1];

        for (int num : arr) {
            count[num]++;
        }

        int index = 0;

        for (int i = 0; i <= max; i++) {
            while (count[i] > 0) {
                arr[index++] = i;
                count[i]--;
            }
        }
    }
}
