
import javax.sound.sampled.SourceDataLine;

public class Linklist{
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            next = null; 
        }
    }
    static class Queue{
        static Node head = null;
        static Node tail = null;    
    }
    public static boolean isEmpty(){
        return head == null && tail == null;
    }
    public static void add(int data){
        //enqueue
        Node newNode = new Node(data);
        if(tail == null){
            tail = head = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    public static int remove(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        int front = head.data;
        if (head == tail){
            tail = null;

        }
        head = head .next;
        return front;
    }
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q.remove());
        q.add(6);
        System.out.println(q.remove());
        q.add(7);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
