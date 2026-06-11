public class DoublyCircularLinkedList {
    
    
    private static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
        }
    }

    private Node head = null;

   
    public void insertEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            newNode.next = head;
            newNode.prev = head;
            return;
        }

        //  The list has elements (Find tail using head.prev)
        Node tail = head.prev;

        tail.next = newNode;
        newNode.prev = tail;
        newNode.next = head;
        head.prev = newNode;
    }

    public void insertBeginning(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            newNode.next = head;
            newNode.prev = head;
            return;
        }

        Node tail = head.prev;

        newNode.next = head;
        newNode.prev = tail;
        head.prev = newNode;
        tail.next = newNode;
        
        // Move the head pointer to the new first node
        head = newNode;
    }

    // 4. Delete a node
    public void deleteValue(int value) {
        if (head == null) return;

        Node curr = head;
        
        // Search for the node to delete
        do {
            if (curr.data == value) {
                // Case 1: It is the only node in the list
                if (curr.next == head && curr.prev == head) {
                    head = null;
                    return;
                }

                // Unlink the current node from its neighbors
                curr.prev.next = curr.next;
                curr.next.prev = curr.prev;

                // Case 2: We are deleting the head node
                if (curr == head) {
                    head = curr.next; 
                }
                return;
            }
            curr = curr.next;
        } while (curr != head);
    }

    
    public void displayForward() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node temp = head;
        System.out.print("Forward: ");
        do {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        } while (temp != head); 
        System.out.println("(Head)");
    }

    
    public void displayBackward() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node temp = head.prev; 
        System.out.print("Backward: ");
        do {
            System.out.print(temp.data + " <-> ");
            temp = temp.prev;
        } while (temp != head.prev); 
        System.out.println("(Tail)");
    }

 
    public static void main(String[] args) {
        DoublyCircularLinkedList list = new DoublyCircularLinkedList();

        list.insertEnd(10);
        list.insertEnd(20);
        list.insertEnd(30);
        list.insertBeginning(5);

        list.displayForward();  
        list.displayBackward(); 

        System.out.println("\nDeleting 20...");
        list.deleteValue(20);
        list.displayForward();  
    }
}


