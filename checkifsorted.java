public class checkifsorted {
 public static void main(String[] args) {
        int[] nums = {1,5,6,8,2,0};
        check(nums);
    }
    public boolean check(int[] nums) {

        int count = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {

            if (nums[i] > nums[(i + 1) % n]) {
                count++;
            }
        }

        return count <= 1;
    }
   
}