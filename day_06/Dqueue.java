class Deque {
    private int[] arr;
    private int front, rear, size;

    public Deque(int size) {
        this.size = size;
        arr = new int[size];
        front = -1;
        rear = -1;
    }

    public void insertFront(int value) {
        if (front == 0) {
            System.out.println("No Space at Front");
            return;
        }

        if (front == -1) {
            front = rear = 0;
        } else {
            front--;
        }

        arr[front] = value;
    }

    public void insertRear(int value) {
        if (rear == size - 1) {
            System.out.println("No Space at Rear");
            return;
        }

        if (front == -1) {
            front = rear = 0;
        } else {
            rear++;
        }

        arr[rear] = value;
    }

    public int deleteFront() {
        if (front == -1) {
            System.out.println("Deque Empty");
            return -1;
        }

        int val = arr[front];

        if (front == rear) {
            front = rear = -1;
        } else {
            front++;
        }

        return val;
    }

    public int deleteRear() {
        if (rear == -1) {
            System.out.println("Deque Empty");
            return -1;
        }

        int val = arr[rear];

        if (front == rear) {
            front = rear = -1;
        } else {
            rear--;
        }

        return val;
    }

    public void display() {
        if (front == -1) {
            System.out.println("Deque Empty");
            return;
        }

        for (int i = front; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Deque d = new Deque(10);

        d.insertRear(20);
        d.insertRear(30);
        d.insertFront(10);

        d.display();

        d.deleteFront();
        d.deleteRear();

        d.display();
    }
}