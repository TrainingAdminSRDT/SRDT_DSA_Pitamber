class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class CircularLinkedList {
    Node head = null;

    // Insert at end
    public void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            newNode.next = head;
            return;
        }

        Node temp = head;

        while (temp.next != head) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.next = head;
    }

    // Display
    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;

        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != head);

        System.out.println("(Head)");
    }

    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();

        cll.insert(10);
        cll.insert(20);
        cll.insert(30);
        cll.insert(40);

        cll.display();
    }
}