public class Queue {
    private int[] arr;
    private int front;
    private int rear;
    private int size;

    public Queue(int capacity) {
        arr = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    // Enqueue
    public void enqueue(int value) {
        if (size == arr.length) {
            System.out.println("Queue Overflow");
            return;
        }
        rear = (rear + 1) % arr.length;
        arr[rear] = value;
        size++;
    }

    // Dequeue
    public int dequeue() {
        if (size == 0) {
            System.out.println("Queue Underflow");
            return -1;
        }
        int value = arr[front];
        front = (front + 1) % arr.length;
        size--;
        return value;
    }

    // Peek
    public int peek() {
        if (size == 0) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return arr[front];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println("Front: " + q.peek());      // 10
        System.out.println("Dequeued: " + q.dequeue()); // 10
        System.out.println("Front: " + q.peek());      // 20
    }
}