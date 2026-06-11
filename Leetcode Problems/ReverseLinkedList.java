public class ReverseLinkedList {

    // --- 1. The ListNode Class ---
    static class ListNode {
        int val;
        ListNode next;
        
        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    // --- 2. The Iterative Solution ---
    public ListNode reverseListIterative(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        
        while (current != null) {
            ListNode nextTemp = current.next;
            current.next = prev;
            prev = current;
            current = nextTemp;
        }
        return prev;
    }

    // --- 3. The Recursive Solution ---
    public ListNode reverseListRecursive(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode reversedListHead = reverseListRecursive(head.next);
        head.next.next = head;
        head.next = null;
        return reversedListHead;
    }

    // --- Helper Method to Print the List ---
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // --- 4. Main Method for VS Code Testing ---
    public static void main(String[] args) {
        ReverseLinkedList solution = new ReverseLinkedList();

        // Create the list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("--- Original List ---");
        printList(head); // Output: 1 -> 2 -> 3 -> 4 -> 5 -> null

        // Test Iterative Reversal
        ListNode reversedIterative = solution.reverseListIterative(head);
        System.out.println("\n--- After Iterative Reversal ---");
        printList(reversedIterative); // Output: 5 -> 4 -> 3 -> 2 -> 1 -> null

        // Note: Because the iterative method modified the actual nodes in memory, 
        // if we want to test recursive, we pass the 'reversedIterative' list back in 
        // to reverse it A SECOND TIME (putting it back to 1->2->3->4->5)
        
        ListNode reversedRecursive = solution.reverseListRecursive(reversedIterative);
        System.out.println("\n--- After Recursive Reversal (Back to original) ---");
        printList(reversedRecursive); // Output: 1 -> 2 -> 3 -> 4 -> 5 -> null
    }
}