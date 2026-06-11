import java.util.Collections;
import java.util.PriorityQueue;

// Renamed the class so it doesn't conflict with java.util.PriorityQueue
public class PriorityQueueDemo { 
    public static void main(String[] args) {
        // 1. Min-Heap (Default: Smallest elements emerge first)
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.add(25);
        minHeap.add(4);
        minHeap.add(5);
        
        System.out.println("Min-Heap Top: " + minHeap.peek()); // Outputs 4
        System.out.println("Removed: " + minHeap.poll());      // Removes 4
        
        // 2. Max-Heap (Custom Comparator: Largest elements emerge first)
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        maxHeap.add(25);
        maxHeap.add(4);
        maxHeap.add(5);
        
        System.out.println("Max-Heap Top: " + maxHeap.peek()); // Outputs 25
        System.out.println("Removed: " + maxHeap.poll());      // Removes 25
    }
}