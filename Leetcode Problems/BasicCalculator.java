
 import java.util.Stack;

public class BasicCalculator {

    // --- The LeetCode Solution ---
    public int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        int result = 0;
        int number = 0;
        int sign = 1; // 1 represents positive, -1 represents negative

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isDigit(c)) {
                // Build the number (multiply by 10 to shift digits left)
                number = 10 * number + (c - '0');
            } 
            else if (c == '+') {
                // Add the previous number to our running total, reset for the next one
                result += sign * number;
                number = 0;
                sign = 1;
            } 
            else if (c == '-') {
                // Add the previous number to our running total, set sign to negative
                result += sign * number;
                number = 0;
                sign = -1;
            } 
            else if (c == '(') {
                // Save the current result and sign before we dive into the brackets
                stack.push(result);
                stack.push(sign);
                
                // Reset result and sign for the new sub-expression
                result = 0;
                sign = 1;
            } 
            else if (c == ')') {
                // Add the very last number inside the brackets to the local result
                result += sign * number;
                number = 0;
                
                // Pop the sign from before the '(' and multiply it by the local result
                result *= stack.pop();
                
                // Pop the old result from before the '(' and add it to our final total
                result += stack.pop();
            }
        }

        // If there's a number left over at the end of the string, add it
        if (number != 0) {
            result += sign * number;
        }

        return result;
    }

    // --- Main Method for Local Testing ---
    public static void main(String[] args) {
        BasicCalculator calc = new BasicCalculator();
        
        System.out.println("Input: \"1 + 1\"               -> Output: " + calc.calculate("1 + 1"));               // Expected: 2
        System.out.println("Input: \" 2-1 + 2 \"           -> Output: " + calc.calculate(" 2-1 + 2 "));           // Expected: 3
        System.out.println("Input: \"(1+(4+5+2)-3)+(6+8)\" -> Output: " + calc.calculate("(1+(4+5+2)-3)+(6+8)")); // Expected: 23
        System.out.println("Input: \"- (3 + (4 + 5))\"     -> Output: " + calc.calculate("- (3 + (4 + 5))"));     // Expected: -12
    }
}   

