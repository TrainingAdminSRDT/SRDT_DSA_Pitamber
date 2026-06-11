import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.Arrays; // Needed to print the arrays in the terminal

public class NextGreaterElement {

    // --- The Core Logic ---
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> nextGreaterMap = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        // Process nums2 to find the next greater element for every number
        for (int currentNum : nums2) {
            while (!stack.isEmpty() && currentNum > stack.peek()) {
                int poppedNum = stack.pop();
                nextGreaterMap.put(poppedNum, currentNum);
            }
            stack.push(currentNum);
        }

        // Any numbers still left in the stack have no greater element
        while (!stack.isEmpty()) {
            nextGreaterMap.put(stack.pop(), -1);
        }

        // Build the final answer for nums1
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            result[i] = nextGreaterMap.get(nums1[i]);
        }

        return result;
    }

    // --- Main Method for VS Code Testing ---
    public static void main(String[] args) {
        NextGreaterElement solution = new NextGreaterElement();

        // Test Case 1
        int[] nums1_ex1 = {4, 1, 2};
        int[] nums2_ex1 = {1, 3, 4, 2};
        int[] result1 = solution.nextGreaterElement(nums1_ex1, nums2_ex1);
        
        System.out.println("--- Example 1 ---");
        System.out.println("Input: nums1 = [4, 1, 2], nums2 = [1, 3, 4, 2]");
        System.out.println("Output: " + Arrays.toString(result1)); // Expected: [-1, 3, -1]
        System.out.println();

        // Test Case 2
        int[] nums1_ex2 = {2, 4};
        int[] nums2_ex2 = {1, 2, 3, 4};
        int[] result2 = solution.nextGreaterElement(nums1_ex2, nums2_ex2);
        
        System.out.println("--- Example 2 ---");
        System.out.println("Input: nums1 = [2, 4], nums2 = [1, 2, 3, 4]");
        System.out.println("Output: " + Arrays.toString(result2)); // Expected: [3, -1]
    }
}