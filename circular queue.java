package SRDT_DSA_Pitamber;

public class circular queue {
    class CircularQueue {
    int[] queue;
    int front, rear, size;

    CircularQueue(int size) {
        this.size = size;
        queue = new int[size];
        front = rear = -1;
    }

    void enqueue(int data) {
        if ((rear + 1) % size == front) {
            System.out.println("Queue Full");
            return;
        }

        if (front == -1)
            front = 0;

        rear = (rear + 1) % size;
        queue[rear] = data;
    }

    void dequeue() {
        if (front == -1) {
            System.out.println("Queue Empty");
            return;
        }

        System.out.println("Deleted: " + queue[front]);

        if (front == rear)
            front = rear = -1;
        else
            front = (front + 1) % size;
    }

    void display() {
        if (front == -1) {
            System.out.println("Queue Empty");
            return;
        }

        int i = front;
        while (true) {
            System.out.print(queue[i] + " ");
            if (i == rear)
                break;
            i = (i + 1) % size;
        }
        System.out.println();
    }
}
    
}
