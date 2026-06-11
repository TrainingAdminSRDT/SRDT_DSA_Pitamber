public class CheckSortedRotated {

    public static boolean check(int[] nums) {
        int count = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n]) {
                count++;
            }
        }

        return count <= 1;
    }

    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 1, 2};

        if (check(nums)) {
            System.out.println("Array is sorted and rotated");
        } else {
            System.out.println("Array is not sorted and rotated");
        }
    }
}