class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class linked {
    public static void main(String[] args) {
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        first.next = second;
        second.next = third;
        Node head = first;
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            temp = temp.next;
        }
        System.out.println("null");
    }
}

