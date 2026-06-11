import java.util.Stack;

public class Palindrome {

    
    static class Node {
        int data;
        Node next;
        
        Node(int data) {
            this.data = data;
        }
    }

    public static boolean isPalindrome(Node head) {
        
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
            
            if (current.data != stack.pop()) {
                return false;
            }
            current = current.next;
        }

        return true;
    }

    
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(2);
        head.next.next.next = new Node(1);

        System.out.println("Is Palindrome: " + isPalindrome(head)); 
    }
}