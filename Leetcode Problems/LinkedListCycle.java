public class LinkedListCycle {

    // --- 1. The ListNode Class (Required for local testing) ---
    static class ListNode {
        int val;
        ListNode next;
        
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    // --- 2. The Core Logic ---
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        
        ListNode slow = head;
        ListNode fast = head;
        
        while (fast != null && fast.next != null) {
            slow = slow.next;          // Tortoise moves 1 step
            fast = fast.next.next;     // Hare moves 2 steps
            
            if (slow == fast) {
                return true;           // Pointers collided!
            }
        }
        
        return false;
    }

    // --- 3. Main Method for VS Code Testing ---
    public static void main(String[] args) {
        LinkedListCycle solution = new LinkedListCycle();

        // --- Test Case 1 ---
        // List: 3 -> 2 -> 0 -> -4 (and -4 points back to 2)
        ListNode head1 = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node0 = new ListNode(0);
        ListNode nodeMinus4 = new ListNode(-4);
        
        head1.next = node2;
        node2.next = node0;
        node0.next = nodeMinus4;
        nodeMinus4.next = node2; // <--- This creates the cycle!
        
        System.out.println("--- Example 1 ---");
        System.out.println("Output: " + solution.hasCycle(head1)); // Expected: true
        System.out.println();

        // --- Test Case 2 ---
        // List: 1 -> 2 (and 2 points back to 1)
        ListNode head2 = new ListNode(1);
        ListNode nodeTwo = new ListNode(2);
        
        head2.next = nodeTwo;
        nodeTwo.next = head2; // <--- This creates the cycle!
        
        System.out.println("--- Example 2 ---");
        System.out.println("Output: " + solution.hasCycle(head2)); // Expected: true
        System.out.println();

        // --- Test Case 3 ---
        // List: 1 (no cycle)
        ListNode head3 = new ListNode(1);
        
        System.out.println("--- Example 3 ---");
        System.out.println("Output: " + solution.hasCycle(head3)); // Expected: false
    }
}