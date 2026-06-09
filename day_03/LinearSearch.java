
public class LinearSearch {

    boolean findElement(int arr[], int target, int index) {
        if (index > 0) {

            if (arr[index] == target)
                return true;
            findElement(arr, target, index - 1);
        }
        return false;
    }

    public static void main(String agrs[]) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        LinearSearch obj = new LinearSearch();
        System.out.println(obj.findElement(arr, 45, arr.length - 1));
    }
}
