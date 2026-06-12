class FindCycleStart {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node findCycleStart(Node head) {
        Node slow = head;
        Node fast = head;

        // Detect cycle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                // Find cycle start
                Node ptr = head;

                while (ptr != slow) {
                    ptr = ptr.next;
                    slow = slow.next;
                }

                return ptr;
            }
        }

        return null; // No cycle
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        // Create cycle: 5 -> 3
        head.next.next.next.next.next = head.next.next;

        Node start = findCycleStart(head);

        if (start != null) {
            System.out.println("Cycle starts at node: " + start.data);
        } else {
            System.out.println("No cycle found");
        }
    }
}