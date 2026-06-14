/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k == 1) {
            return head;
        }
        
        // Dummy node to simplify edge cases at the head of the list
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode groupPrev = dummy;
        
        while (true) {
            // 1. Check if there are at least k nodes left
            ListNode kth = getKthNode(groupPrev, k);
            if (kth == null) {
                break;
            }
            
            // Record the node right after the current k-group
            ListNode groupNext = kth.next;
            
            // 2. Reverse the current group
            ListNode prev = kth.next; 
            ListNode curr = groupPrev.next;
            
            while (curr != groupNext) {
                ListNode temp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = temp;
            }
            
            // 3. Reconnect the reversed group back into the list
            ListNode newGroupPrev = groupPrev.next;
            groupPrev.next = kth;
            groupPrev = newGroupPrev;
        }
        
        return dummy.next;
    }
    
    private ListNode getKthNode(ListNode curr, int k) {
        while (curr != null && k > 0) {
            curr = curr.next;
            k--;
        }
        return curr;
    }
}