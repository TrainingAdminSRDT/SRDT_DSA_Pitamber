public class circularLinkedList {

    Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

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

    // Delete a node
    public void delete(int key) {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node curr = head;
        Node prev = null;

        // Delete head node
        if (head.data == key) {

            if (head.next == head) {
                head = null;
                return;
            }

            Node last = head;

            while (last.next != head) {
                last = last.next;
            }

            head = head.next;
            last.next = head;
            return;
        }

        do {
            prev = curr;
            curr = curr.next;

            if (curr.data == key) {
                prev.next = curr.next;
                return;
            }

        } while (curr != head);

        System.out.println("Key not found");
    }

    // Display
    public void display() {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;

        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);

        System.out.println();
    }

    public static void main(String[] args) {

        circularLinkedList list = new circularLinkedList();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        System.out.println("Circular Linked List:");
        list.display();

        list.delete(20);

        System.out.println("After Deletion:");
        list.display();
    }
}