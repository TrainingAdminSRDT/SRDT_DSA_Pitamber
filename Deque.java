public class Deque {
    private int[] arr;
    private int front, rear, size, capacity;
    public Deque(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        front = -1;
        rear = -1;
        size = 0;
    }
    public boolean isFull() {
        return size == capacity;
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public void insertFront(int data) {
        if (isFull()) {
            System.out.println("Deque Overflow");
            return;
        }
        if (front == -1) { // first element
            front = rear = 0;
        } else {
            front = (front - 1 + capacity) % capacity;
        }
        arr[front] = data;
        size++;
    }
    public void insertRear(int data) {
        if (isFull()) {
            System.out.println("Deque Overflow");
            return;
        }
        if (rear == -1) { // first element
            front = rear = 0;
        } else {
            rear = (rear + 1) % capacity;
        }
        arr[rear] = data;
        size++;
    }
    public void deleteFront() {
        if (isEmpty()) {
            System.out.println("Deque Underflow");
            return;
        }
        if (front == rear) {
            front = rear = -1;
        } else {
            front = (front + 1) % capacity;
        }
        size--;
    }
    public void deleteRear() {
        if (isEmpty()) {
            System.out.println("Deque Underflow");
            return;
        }
        if (front == rear) {
            front = rear = -1;
        } else {
            rear = (rear - 1 + capacity) % capacity;
        }
        size--;
    }
    public int getFront() {
        if (isEmpty()) {
            System.out.println("Deque is Empty");
            return -1;
        }
        return arr[front];
    }
    public int getRear() {
        if (isEmpty()) {
            System.out.println("Deque is Empty");
            return -1;
        }
        return arr[rear];
    }
    public void display() {
        if (isEmpty()) {
            System.out.println("Deque is Empty");
            return;
        }
        int i = front;
        while (true) {
            System.out.print(arr[i] + " ");
            if (i == rear)
                break;
            i = (i + 1) % capacity;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Deque dq = new Deque(5);
        dq.insertRear(10);
        dq.insertRear(20);
        dq.insertFront(5);
        dq.insertFront(1);
        dq.display();
        dq.deleteFront();
        dq.deleteRear();
        dq.display();
        System.out.println("Front: " + dq.getFront());
        System.out.println("Rear: " + dq.getRear());
    }

}
