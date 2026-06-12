import java.util.ArrayList;

class PalindromeLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static boolean isPalindrome(Node head) {
        ArrayList<Integer> list = new ArrayList<>();

        Node temp = head;

        // Store all values
        while (temp != null) {
            list.add(temp.data);
            temp = temp.next;
        }

        int left = 0;
        int right = list.size() - 1;

        while (left < right) {
            if (!list.get(left).equals(list.get(right))) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(2);
        head.next.next.next = new Node(1);

        System.out.println(isPalindrome(head));
    }
}