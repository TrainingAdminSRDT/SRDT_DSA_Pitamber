class DoublyCircularLinkedList {

    class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    Node head = null;

    // Insert at end
    public void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            head.next = head;
            head.prev = head;
            return;
        }

        Node last = head.prev;

        last.next = newNode;
        newNode.prev = last;

        newNode.next = head;
        head.prev = newNode;
    }

    // Display forward
    public void displayForward() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;

        do {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        } while (temp != head);

        System.out.println("(back to head)");
    }

    // Display backward
    public void displayBackward() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head.prev; // last node

        do {
            System.out.print(temp.data + " <-> ");
            temp = temp.prev;
        } while (temp != head.prev);

        System.out.println("(back to last)");
    }

    public static void main(String[] args) {
        DoublyCircularLinkedList dcll = new DoublyCircularLinkedList();

        dcll.insert(10);
        dcll.insert(20);
        dcll.insert(30);
        dcll.insert(40);

        System.out.println("Forward Traversal:");
        dcll.displayForward();

        System.out.println("Backward Traversal:");
        dcll.displayBackward();
    }
}