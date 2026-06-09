public class MergeSort {
     static void mergeSort(int arr[], int l, int r) {
         if (l >= r) {
            return;
        }
          int mid = (l + r) / 2;

        mergeSort(arr, l, mid);
        mergeSort(arr, mid + 1, r);

        int temp[] = new int[r - l + 1];

        int i = l, j = mid + 1, k = 0;

        while (i <= mid && j <= r) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= r) {
            temp[k++] = arr[j++];
        }

        for (i = l, k = 0; i <= r; i++, k++) {
            arr[i] = temp[k];
        }
    }
     public static void main(String[] args) {

        int arr[] = {5, 2, 8, 1, 9, 3};

        mergeSort(arr, 0, arr.length - 1);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}