public class Main2 {
       private int[] arr;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public Main2(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void enqueue(int item) {
        if (size == capacity) {
            System.out.println("Queue Overflow");
            return;
        }

        rear = (rear + 1) % capacity;
        arr[rear] = item;
        size++;
    }

     public int dequeue() {
        if (size == 0) {
            throw new RuntimeException("Queue Underflow");
        }

        int item = arr[front];
        front = (front + 1) % capacity;
        size--;
        return item;
    }

    public int peek() {
        if (size == 0) {
            throw new RuntimeException("Queue is Empty");
        }
        return arr[front];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }
}
