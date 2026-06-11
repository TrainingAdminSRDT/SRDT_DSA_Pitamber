import java.util.Stack;
import java.util.Arrays; // Needed to print the arrays easily

public class DailyTemperatures {

    // --- The Core Logic ---
    public int[] dailyTemperatures(int[] temperatures) {
        int[] answer = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < temperatures.length; i++) {
            int currentTemp = temperatures[i];

            while (!stack.isEmpty() && currentTemp > temperatures[stack.peek()]) {
                int poppedIndex = stack.pop();
                // Calculate the distance (number of days)
                answer[poppedIndex] = i - poppedIndex;
            }

            stack.push(i);
        }

        return answer;
    }

    // --- Main Method for VS Code Testing ---
    public static void main(String[] args) {
        DailyTemperatures solution = new DailyTemperatures();

        // Test Case 1
        int[] temps1 = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] result1 = solution.dailyTemperatures(temps1);
        System.out.println("--- Example 1 ---");
        System.out.println("Input:  " + Arrays.toString(temps1));
        System.out.println("Output: " + Arrays.toString(result1)); 
        // Expected: [1, 1, 4, 2, 1, 1, 0, 0]
        System.out.println();

        // Test Case 2
        int[] temps2 = {30, 40, 50, 60};
        int[] result2 = solution.dailyTemperatures(temps2);
        System.out.println("--- Example 2 ---");
        System.out.println("Input:  " + Arrays.toString(temps2));
        System.out.println("Output: " + Arrays.toString(result2)); 
        // Expected: [1, 1, 1, 0]
        System.out.println();

        // Test Case 3
        int[] temps3 = {30, 60, 90};
        int[] result3 = solution.dailyTemperatures(temps3);
        System.out.println("--- Example 3 ---");
        System.out.println("Input:  " + Arrays.toString(temps3));
        System.out.println("Output: " + Arrays.toString(result3)); 
        // Expected: [1, 1, 0]
    }
}