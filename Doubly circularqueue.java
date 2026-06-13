class Node {
    int data;
    Node next, prev;

    Node(int data) {
        this.data = data;
        next = prev = null;
    }
}

class DoublyCircularQueue {
    Node front, rear;

    
    void enqueue(int data) {
        Node newNode = new Node(data);

        if (front == null) {
            front = rear = newNode;
            front.next = front;
            front.prev = front;
        } else {
            newNode.prev = rear;
            newNode.next = front;

            rear.next = newNode;
            front.prev = newNode;

            rear = newNode;
        }
    }

    
    void dequeue() {
        if (front == null) {
            System.out.println("Queue Underflow");
            return;
        }

        if (front == rear) {
            front = rear = null;
        } else {
            front = front.next;
            front.prev = rear;
            rear.next = front;
        }
    }

    
    void display() {
        if (front == null) {
            System.out.println("Queue is Empty");
            return;
        }

        Node temp = front;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != front);

        System.out.println();
    }

    public static void main(String[] args) {
        DoublyCircularQueue q = new DoublyCircularQueue();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.print("Queue: ");
        q.display();

        q.dequeue();

        System.out.print("After Dequeue: ");
        q.display();
    }
}