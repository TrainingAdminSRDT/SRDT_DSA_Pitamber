

import java.util.Stack;

public class UsingStackClass {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Push
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Peek (top element)
        System.out.println("Top: " + stack.peek());

        // Pop
        System.out.println("Popped: " + stack.pop());

        // Peek again
        System.out.println("Top: " + stack.peek());

        // Check if empty
        System.out.println("Is Empty: " + stack.isEmpty());

        // Size
        System.out.println("Size: " + stack.size());
    }
}
