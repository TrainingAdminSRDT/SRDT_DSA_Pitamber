public class Queue {

    private int arr[];
    private int front = 0;
    private int rear = -1;
    private int size;
    
    public Queue(int capacity){
        arr = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public boolean isFull(){
        return size == arr.length;
    }
    public void enqueue(int x ){
        if(isFull()){
            System.out.println("Queue is full");
            return;
        }
        rear = (rear + 1) % arr.length;
        arr[rear] = x;
        size++;
    }

    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        int x = arr[front];
        front = (front + 1) % arr.length;
        size--;
        return x;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[front];
    }
    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        System.out.println("Front element: " + queue.peek());
        System.out.println("Dequeued element: " + queue.dequeue());
        System.out.println("Dequeued element: " + queue.dequeue());
        System.out.println("Front element after dequeue: " + queue.peek());
    }
}
