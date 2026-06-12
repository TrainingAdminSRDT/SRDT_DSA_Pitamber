class circularQueue {
    int[] arr;
    int front, rear, size;
    circularQueue(int size) {
        this.size = size;
        arr = new int[size];
        front = rear = -1;
    }
    boolean isEmpty() {
        return front == -1;
    }
    boolean isFull() {
        return (rear + 1) % size == front;
    }
    void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue Full");
            return;
        }
        if (front == -1) {
            front = 0;
        }
        rear = (rear + 1) % size;
        arr[rear] = data;
    }
    int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Empty");
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
}