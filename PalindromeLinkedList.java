import java.util.Stack;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class PalindromeLinkedList {
    Node head;

    void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    boolean isPalindrome() {
        Stack<Integer> stack = new Stack<>();

        Node temp = head;

        // Push all elements into stack
        while (temp != null) {
            stack.push(temp.data);
            temp = temp.next;
        }

        // Compare with original list
        temp = head;
        while (temp != null) {
            if (temp.data != stack.pop()) {
                return false;
            }
            temp = temp.next;
        }

        return true;
    }

    public static void main(String[] args) {
        PalindromeLinkedList list = new PalindromeLinkedList();

        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(2);
        list.insert(1);

        if (list.isPalindrome()) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}