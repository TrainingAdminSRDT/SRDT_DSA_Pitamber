class Solution {
    public int maximumSumSubarray(int[] arr, int k) {
        int n = arr.length;

        
        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        int maxSum = windowSum;

        
        for (int i = k; i < n; i++) {
            windowSum = windowSum - arr[i - k] + arr[i];
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }
}