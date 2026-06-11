public class LinkedList {
   
    
}

class Node {
    int data;
    Node next;

    Node(int new_data) {
        data = new_data;
        next = null;
    }
}

class PrintLinkedList {

    static void printList(Node head) {

        if (head == null) {
            return;
        }

        
        System.out.print(head.data);
        if(head.next!=null)
            System.out.print("->");

        printList(head.next);
    }

    public static void main(String[] args) {
      
       
        Node head = new Node(20);
        head.next = new Node(40);
        head.next.next = new Node(50);
        head.next.next.next = new Node(80);

        printList(head);
    }
}