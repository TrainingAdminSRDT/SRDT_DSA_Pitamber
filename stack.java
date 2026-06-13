package SRDT_DSA_Pitamber;

public class stack {
    import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

    
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack: " + stack);

    
        System.out.println("Top Element: " + stack.peek());

    
        System.out.println("Removed: " + stack.pop());

        System.out.println("Stack after pop: " + stack);

    
        System.out.println("Is Empty? " + stack.isEmpty());

        
        System.out.println("Position of 10: " + stack.search(10));
    }
}
    
}
