
    import java.util.Stack;

public class TrappingRainWater {

  
    public int trap(int[] height) {
        int totalWater = 0;
        Stack<Integer> stack = new Stack<>(); 

        for (int i = 0; i < height.length; i++) {
            while (!stack.isEmpty() && height[i] > height[stack.peek()]) {
                int valleyIndex = stack.pop();

                if (stack.isEmpty()) {
                    break; 
                }

                int leftWallIndex = stack.peek();
                int width = i - leftWallIndex - 1;
                int boundedHeight = Math.min(height[leftWallIndex], height[i]) - height[valleyIndex];

                totalWater += width * boundedHeight;
            }
            stack.push(i);
        }
        return totalWater;
    }

  
    public static void main(String[] args) {
        TrappingRainWater solution = new TrappingRainWater();

        // Test Case 1
        int[] height1 = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println("--- Example 1 ---");
        System.out.println("Input:  [0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1]");
        System.out.println("Output: " + solution.trap(height1)); // Expected: 6
        System.out.println();
        
        // Test Case 2
        int[] height2 = {4, 2, 0, 3, 2, 5};
        System.out.println("--- Example 2 ---");
        System.out.println("Input:  [4, 2, 0, 3, 2, 5]");
        System.out.println("Output: " + solution.trap(height2)); // Expected: 9
    }
}

