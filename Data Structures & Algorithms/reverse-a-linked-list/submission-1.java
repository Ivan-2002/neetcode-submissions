/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode curr = head, prev = null, next;

        while (curr != null) {
            // save next value so that the linked list is not lost
            next = curr.next;
            // set the pointer to the previous value
            curr.next = prev;
            // Move both positions one ahead
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
