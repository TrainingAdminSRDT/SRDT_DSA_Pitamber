
public class MaxSubArraySum {

    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        System.out.println(subArray(arr));
    }

    public static int subArray(int arr[]) {
        int maxsum = 0;
        
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum = sum + arr[j];
                if (maxsum < sum) {
                    maxsum = sum;
                }
            }
        }
        return maxsum;
    }

}
