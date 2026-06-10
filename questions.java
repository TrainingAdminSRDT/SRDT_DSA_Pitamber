import java.util.Arrays;

public class AllPrograms {

    static int arraySum(int arr[], int n) {
        if (n == 0)
            return 0;
        return arr[n - 1] + arraySum(arr, n - 1);
    }

    static void merge(int arr[], int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for (int i = 0; i < n1; i++)
            L[i] = arr[l + i];

        for (int j = 0; j < n2; j++)
            R[j] = arr[m + 1 + j];

        int i = 0, j = 0, k = l;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j])
                arr[k++] = L[i++];
            else
                arr[k++] = R[j++];
        }

        while (i < n1)
            arr[k++] = L[i++];

        while (j < n2)
            arr[k++] = R[j++];
    }

    static void mergeSort(int arr[], int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;

            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);

            merge(arr, l, m, r);
        }
    }

    static boolean palindromeRec(String str, int start, int end) {
        if (start >= end)
            return true;

        if (str.charAt(start) != str.charAt(end))
            return false;

        return palindromeRec(str, start + 1, end - 1);
    }

    static int first = -1;
    static int last = -1;

    static void findOccurrence(String str, int idx, char ch) {
        if (idx == str.length())
            return;

        if (str.charAt(idx) == ch) {
            if (first == -1)
                first = idx;
            last = idx;
        }

        findOccurrence(str, idx + 1, ch);
    }

    static boolean isNumberPalindrome(int num) {
        int temp = num;
        int rev = 0;

        while (num > 0) {
            int rem = num % 10;
            rev = rev * 10 + rem;
            num /= 10;
        }

        return temp == rev;
    }

    static String reverseString(String str) {
        if (str.isEmpty())
            return str;

        return reverseString(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5};
        System.out.println("Array Sum = " + arraySum(arr1, arr1.length));

        int arr2[] = {38, 27, 43, 3, 9, 82, 10};
        mergeSort(arr2, 0, arr2.length - 1);
        System.out.println("Sorted Array = " + Arrays.toString(arr2));

        String str1 = "madam";
        System.out.println("Palindrome Recursion = " +
                palindromeRec(str1, 0, str1.length() - 1));

        String str2 = "abaacdaefaah";
        findOccurrence(str2, 0, 'a');
        System.out.println("First Occurrence = " + first);
        System.out.println("Last Occurrence = " + last);

        int num = 121;
        System.out.println("Number Palindrome = " +
                isNumberPalindrome(num));

        String str3 = "Hello";
        System.out.println("Reversed String = " +
                reverseString(str3));
    }
}