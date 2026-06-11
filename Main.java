import java.util.Scanner;
import java.util.Stack;


public class Main { 
    public static void main(String[] args) {
        
      
        Stack<Integer> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of elements to push: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element: ");
            int element = scanner.nextInt();
            stack.push(element);
        }

        System.out.println("Stack: " + stack);

        if (!stack.isEmpty()) {
            System.out.println("Top element: " + stack.peek());
        } else {
            System.out.println("Stack is empty");
        }

        if (!stack.isEmpty()) {
            int popped = stack.pop();
            System.out.println("Popped element: " + popped);
        } else {
            System.out.println("Stack Underflow");
        }

        System.out.println("Stack after pop: " + stack);

        if (stack.isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Stack is not empty");
        }

        System.out.println("Size of stack: " + stack.size());

        scanner.close();
    }
}