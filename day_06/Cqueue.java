class CircularQueue {
    private int[] arr;
    private int front, rear, size;

    public CircularQueue(int size) {
        this.size = size;
        arr = new int[size];
        front = -1;
        rear = -1;
    }

    public void enqueue(int value) {
        if ((rear + 1) % size == front) {
            System.out.println("Circular Queue Full");
            return;
        }

        if (front == -1) {
            front = rear = 0;
        } else {
            rear = (rear + 1) % size;
        }

        arr[rear] = value;
    }

    public int dequeue() {
        if (front == -1) {
            System.out.println("Circular Queue Empty");
            return -1;
        }

        int value = arr[front];

        if (front == rear) {
            front = rear = -1;
        } else {
            front = (front + 1) % size;
        }

        return value;
    }

    public void display() {
        if (front == -1) {
            System.out.println("Circular Queue Empty");
            return;
        }

        int i = front;

        while (true) {
            System.out.print(arr[i] + " ");

            if (i == rear)
                break;

            i = (i + 1) % size;
        }

        System.out.println();
    }

    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue(5);

        cq.enqueue(10);
        cq.enqueue(20);
        cq.enqueue(30);

        cq.display();

        System.out.println("Dequeued: " + cq.dequeue());

        cq.display();
    }
}