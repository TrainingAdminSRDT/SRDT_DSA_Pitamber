public class Palindromelist {

    Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Insert at end
    public void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    // Check palindrome
    public boolean isPalindrome() {

        int count = 0;
        Node temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        int arr[] = new int[count];

        temp = head;
        int i = 0;

        while (temp != null) {
            arr[i++] = temp.data;
            temp = temp.next;
        }

        int left = 0;
        int right = count - 1;

        while (left < right) {
            if (arr[left] != arr[right]) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {

        Palindromelist list = new Palindromelist();

        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(2);
        list.insert(1);

        if (list.isPalindrome()) {
            System.out.println("Linked List is Palindrome");
        } else {
            System.out.println("Linked List is Not Palindrome");
        }
    }
}
