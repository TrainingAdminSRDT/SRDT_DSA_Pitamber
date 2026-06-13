public class LinkedList {
    int data;
    LinkedList next;

    // Constructor for node
    LinkedList(int data) {
        this.data = data;
        this.next = null;
    }

    // Insert at end
    public static LinkedList insert(LinkedList head, int data) {
        LinkedList newNode = new LinkedList(data);

        if (head == null) {
            return newNode;
        }

        LinkedList current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
        return head;
    }

    // Display list
    public static void display(LinkedList head) {
        LinkedList current = head;

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList head = null;

        head = insert(head, 10);
        head = insert(head, 20);
        head = insert(head, 30);

        display(head);
    }
}