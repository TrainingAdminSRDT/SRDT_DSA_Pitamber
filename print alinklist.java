package SRDT_DSA_Pitamber;

public class linklist {
    int data;
    Node next;

node(int data);
    this.data=data;
    this.next=null
    }
}

public class LinkedList {

    Node head;

    
    void printList() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        
        list.head = new Node(10);

        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);

        
        list.head.next = second;
        second.next = third;
        third.next = fourth;

        
        System.out.println("Linked List:");
        list.printList();
    }
}
}

    
    
}
