import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class MonotonicStack {
    public static int[] nextGreaterElement(int[] nums) {
        int[] result = new int[nums.length];
        Arrays.fill(result, -1); 
        
       
        Deque<Integer> stack = new ArrayDeque<>(); 
        
        for (int i = 0; i < nums.length; i++) {
            
            while (!stack.isEmpty() && nums[stack.peek()] < nums[i]) {
                int indexToUpdate = stack.pop();
                result[indexToUpdate] = nums[i];
            }
            
            stack.push(i); 
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {4, 5, 2, 25};
        System.out.println(Arrays.toString(nextGreaterElement(nums))); 
        
    }
}