class Queue {
    private int[] arr;
    private int front, rear, size;

    public Queue(int size) {
        this.size = size;
        arr = new int[size];
        front = 0;
        rear = -1;
    }

    public void enqueue(int value) {
        if (rear == size - 1) {
            System.out.println("Queue Overflow");
            return;
        }
        arr[++rear] = value;
    }

    public int dequeue() {
        if (front > rear) {
            System.out.println("Queue Underflow");
            return -1;
        }
        return arr[front++];
    }

    public void display() {
        if (front > rear) {
            System.out.println("Queue is Empty");
            return;
        }

        for (int i = front; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.display();

        System.out.println("Dequeued: " + q.dequeue());

        q.display();
    }
}