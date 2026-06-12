public class FindMiddle {
    class Node {
    int data;
    Node next;
    Node(int data) { this.data = data; }
}

public class LinkedListUtils {
    public static Node findMiddle(Node head) {
        if (head == null) return null;

        Node slow = head;
        Node fast = head;

       
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        
        return slow; 
    }
}

}