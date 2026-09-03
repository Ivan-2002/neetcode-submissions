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
    public boolean hasCycle(ListNode head) {

            ListNode currSlow = head; 
            ListNode currFast = head;

            while (currFast != null && currFast.next != null) {
                currSlow = currSlow.next;
                currFast = currFast.next.next;

                if (currSlow == currFast) {
                    return true;
                    }
        }
        return false;
    }
}

