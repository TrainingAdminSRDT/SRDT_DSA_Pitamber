import java.util.Stack;

public class Palindrome {

    // 1. Made Node a static class so it can be used inside the static main method
    static class Node {
        int data;
        Node next;
        
        Node(int data) {
            this.data = data;
        }
    }

    public static boolean isPalindrome(Node head) {
        // 2. Added <Integer> to the Stack so Java knows what type of data it holds
        Stack<Integer> stack = new Stack<>();
        Node current = head;

        // Push all elements to stack
        while (current != null) {
            stack.push(current.data);
            current = current.next;
        }

        // Compare again from start
        current = head;
        while (current != null) {
            // Because stack is Stack<Integer>, stack.pop() cleanly unboxes to an int
            if (current.data != stack.pop()) {
                return false;
            }
            current = current.next;
        }

        return true;
    }

    // 3. Removed the unnecessary nested "PalindromeLinkedList" class wrapper
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(2);
        head.next.next.next = new Node(1);

        System.out.println("Is Palindrome: " + isPalindrome(head)); // Output: true
    }
}