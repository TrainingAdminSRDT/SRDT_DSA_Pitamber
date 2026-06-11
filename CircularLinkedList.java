
    public class CircularLinkedList {
    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head = null;
    private Node tail = null;

    
    public void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head; 
        } else {
            tail.next = newNode;  
            tail = newNode;       
            tail.next = head;     
        }
    }

    
    public void delete(int value) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node current = head;
        Node previous = null;

       
        if (current.data == value) {
            if (head == tail) { 
                head = null;
                tail = null;
            } else {
                head = head.next;
                tail.next = head; 
            }
            return;
        }

       
        do {
            previous = current;
            current = current.next;
            
            if (current.data == value) {
                previous.next = current.next;
                if (current == tail) {
                    tail = previous; 
                }
                return;
            }
        } while (current != head);

        System.out.println("Element " + value + " not found.");
    }

    
    public void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node current = head;
        System.out.print("Circular List: ");
        do {
            System.out.print(current.data + " -> ");
            current = current.next;
        } while (current != head); 
        System.out.println("(Head)");
    }

   
    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();

       
        cll.insert(10);
        cll.insert(20);
        cll.insert(30);
        cll.insert(40);
        cll.insert(50);
        cll.insert(60);
        cll.insert(70);
        cll.display(); 

       
        System.out.println("\nDeleting 30 (Middle Node):");
        cll.delete(30);
        cll.display();

        System.out.println("\nDeleting 10 (Head Node):");
        cll.delete(10);
        cll.display();
    }
}
