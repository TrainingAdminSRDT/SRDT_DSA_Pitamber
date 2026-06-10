public class CircularQueue {
    private int[] queue;
    private int front, rear, size, capacity;

    public CircularQueue(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue Overflow");
            return;
        }

        rear = (rear + 1) % capacity;
        queue[rear] = data;
        size++;

        System.out.println(data + " inserted");
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return -1;
        }

        int data = queue[front];
        front = (front + 1) % capacity;
        size--;

        return data;
    }

    public int peek() {
        if (isEmpty()) {
            return -1;
        }
        return queue[front];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        int i = front;
        for (int count = 0; count < size; count++) {
            System.out.print(queue[i] + " ");
            i = (i + 1) % capacity;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue(5);

        cq.enqueue(10);
        cq.enqueue(20);
        cq.enqueue(30);
        cq.enqueue(40);

        cq.display();

        System.out.println("Removed: " + cq.dequeue());
        System.out.println("Removed: " + cq.dequeue());

        cq.enqueue(50);
        cq.enqueue(60);

        cq.display();

        System.out.println("Front: " + cq.peek());
    }
}