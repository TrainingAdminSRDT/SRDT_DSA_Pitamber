class Node {
    int data;
    Node next;
    Node prev;

    public Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class DoublyLinkedlist {
    private Node head = null;
    private Node tail = null;

    // Method to add a node to the end of the list
    public void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode; 
            newNode.prev = tail; 
            tail = newNode;      
        }
    }

    // Traverse Forward (Head to Tail)
    public void displayForward() {
        Node current = head;
        System.out.print("Forward:  ");
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Traverse Backward (Tail to Head)
    public void displayBackward() {
        Node current = tail;
        System.out.print("Backward: ");
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.prev; 
        }
        System.out.println("null");
    }



    public static void main(String[] args) {
        DoublyLinkedlist list = new DoublyLinkedlist();

        list.insert(10);
        list.insert(20);
        list.insert(30);

        list.displayForward();
        list.displayBackward();
    }
}
