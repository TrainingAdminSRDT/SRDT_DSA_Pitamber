public class DoublyLinkedList {
    Node head;

    // The Node class represents each element in the list
    static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static void insert(DoublyLinkedList List, int data){
        DoublyLinkedList.Node newNode = new DoublyLinkedList.Node(data);
        if(List.head == null){
            List.head = newNode;
        }
        else{
            DoublyLinkedList.Node t = List.head;
            while(t.next !=  null){
                t = t.next;
            }
            t.next = newNode;
            newNode.prev = t;
        }
    }
    public static void delete(DoublyLinkedList List, int key){
       if(List.head == null){
        System.out.println("List is empty");
        return;
       }
       DoublyLinkedList.Node t = List.head;
       while(t != null){
        if(t.data == key){
            if(t.prev != null){
                t.prev.next = t.next;
            }
            else{
                List.head = t.next;
            }
            if(t.next != null){
                t.next.prev = t.prev;
            }
            return;
        }
        t = t.next;
       }
       System.out.println("Key not found");
    } 

    public static void display(DoublyLinkedList List){
        if(List.head == null){
            System.out.println("List is empty");
            return;
        }
        DoublyLinkedList.Node t = List.head;
        while(t != null){
            System.out.print(t.data + " ");
            t = t.next;
        }
        System.out.println();
    }
    public static void main (String[] args){
        DoublyLinkedList List = new DoublyLinkedList();
        insert(List,10);
        insert(List,20);
        insert(List,30);
        insert(List,40);
        insert(List,50);
        delete(List,30);
        display(List);
    }
}
