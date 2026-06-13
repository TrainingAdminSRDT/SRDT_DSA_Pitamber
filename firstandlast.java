class Solution {

    public int[] searchRange(int[] nums, int target) {
        return new int[]{
            first(nums, target),
            last(nums, target)
        };
    }

    int first(int[] nums, int target) {
        int ans = -1;
        int l = 0, r = nums.length - 1;

        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (nums[mid] == target) {
                ans = mid;
                r = mid - 1;
            } else if (nums[mid] < target)
                l = mid + 1;
            else
                r = mid - 1;
        }
        return ans;
    }

    int last(int[] nums, int target) {
        int ans = -1;
        int l = 0, r = nums.length - 1;

        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (nums[mid] == target) {
                ans = mid;
                l = mid + 1;
            } else if (nums[mid] < target)
                l = mid + 1;
            else
                r = mid - 1;
        }
        return ans;
    }
}