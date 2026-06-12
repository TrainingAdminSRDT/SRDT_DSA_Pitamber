import java.util.LinkedList;

public class linkedList {
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void insertNode(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;   
        }
        else{
            Node t = head;
            while(t.next !=null){
                t = t.next;
                
            }
            t.next = newNode;
        }
    }

    public void display(){
        Node t = head;
        while(t != null){
            System.out.println(t.data + " ");
            t = t.next;
        }
    }

    public static void main(String[] args){
        linkedList List = new linkedList();
        List.insertNode(10);
        List.insertNode(20);
        List.insertNode(30);
        List.insertNode(40);
        List.insertNode(50);
        List.display();
    }
}


