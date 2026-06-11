import java.util.Stack;

public class QueueUsingStack {
    
    // --- 1. Class Variables ---
    private Stack<Integer> inputStack;
    private Stack<Integer> outputStack;

    // --- 2. Constructor ---
    // FIXED: Constructor name now exactly matches the class name
    public QueueUsingStack() { 
        inputStack = new Stack<>();
        outputStack = new Stack<>();
    }
    
    // --- 3. Queue Methods ---
    public void push(int x) {
        inputStack.push(x);
    }
    
    public int pop() {
        shiftStacks();
        return outputStack.pop();
    }
    
    public int peek() {
        shiftStacks();
        return outputStack.peek();
    }
    
    public boolean empty() {
        return inputStack.isEmpty() && outputStack.isEmpty();
    }

    // --- 4. The Helper Method ---
    private void shiftStacks() {
        if (outputStack.isEmpty()) {
            while (!inputStack.isEmpty()) {
                outputStack.push(inputStack.pop());
            }
        }
    }

    // --- 5. Main Method (For VS Code Testing) ---
    public static void main(String[] args) {
        // FIXED: Using the correct class name to create the object
        QueueUsingStack myQueue = new QueueUsingStack(); 
        
        System.out.println("Pushing 1...");
        myQueue.push(1); // queue is: [1]
        
        System.out.println("Pushing 2...");
        myQueue.push(2); // queue is: [1, 2]
        
        System.out.println("Peek: " + myQueue.peek());      // Expected: 1
        System.out.println("Pop: " + myQueue.pop());        // Expected: 1 (Queue becomes [2])
        System.out.println("Is Empty? " + myQueue.empty()); // Expected: false
    }
}