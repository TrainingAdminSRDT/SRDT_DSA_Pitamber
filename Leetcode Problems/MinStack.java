import java.util.Stack;

public class MinStack {
    
    // --- 1. Class Variables ---
    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    // --- 2. Constructor ---
    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }
    
    // --- 3. Stack Methods ---
    public void push(int val) {
        stack.push(val);
        // If minStack is empty, OR the new value is <= the current minimum, push to minStack
        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }
    
    public void pop() {
        // Use .equals() to safely compare Integer objects
        if (stack.peek().equals(minStack.peek())) {
            minStack.pop();
        }
        stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }

    // --- 4. Main Method (For Local Testing) ---
    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        
        System.out.println("Pushing -2, 0, -3...");
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        
        System.out.println("getMin() -> " + minStack.getMin()); // Expected: -3
        
        System.out.println("Popping the top element...");
        minStack.pop();
        
        System.out.println("top()    -> " + minStack.top());    // Expected: 0
        System.out.println("getMin() -> " + minStack.getMin()); // Expected: -2
    }
}