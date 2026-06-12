public class Dqueue<T> {
    
    private static class Node<T> {
        T data;
        Node<T> next;
        Node<T> prev;

        Node(T data) {
            this.data = data;
        }
    }

    private Node<T> head;
    private Node<T> tail;
    private int size;

    public Dqueue() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void addFirst(T item) {
        Node<T> newNode = new Node<>(item);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(T item) {
        Node<T> newNode = new Node<>(item);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    public T removeFirst() {
        if (isEmpty()) {
            throw new java.util.NoSuchElementException("Deque underflow");
        }
        T data = head.data;
        head = head.next;
        if (head == null) {
            tail = null; 
        } else {
            head.prev = null;
        }
        size--;
        return data;
    }
    
    public T removeLast() {
        if (isEmpty()) {
            throw new java.util.NoSuchElementException("Deque underflow");
        }
        T data = tail.data;
        tail = tail.prev;
        if (tail == null) {
            head = null; 
        } else {
            tail.next = null;
        }
        size--;
        return data;
    }

    public T peekFirst() {
        return isEmpty() ? null : head.data;
    }

    public T peekLast() {
        return isEmpty() ? null : tail.data;
    }

    public static void main(String[] args) {
      
        Dqueue<Integer> deque = new Dqueue<>();

        System.out.println("Adding 10 to the end...");
        deque.addLast(10);
        
        System.out.println("Adding 20 to the front...");
        deque.addFirst(20);
        
        System.out.println("Adding 30 to the end...");
        deque.addLast(30);

        // Current state should be: [20, 10, 30]
        System.out.println("\n--- Current Queue Status ---");
        System.out.println("First Element: " + deque.peekFirst()); 
        System.out.println("Last Element: " + deque.peekLast());   
        System.out.println("Total Size: " + deque.size());         

        System.out.println("\n--- Removing Elements ---");
        System.out.println("Removed from front: " + deque.removeFirst()); // Removes 20
        System.out.println("Removed from back: " + deque.removeLast());   // Removes 30

        // Current state should be: [10]
        System.out.println("\n--- Final Queue Status ---");
        System.out.println("First Element: " + deque.peekFirst()); // Should be 10
        System.out.println("Total Size: " + deque.size());         // Should be 1
    }
}