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
    public void reorderList(ListNode head) {

        // Step 1: Find the middle of the list
        ListNode slow = head;
        ListNode fast = head;

        // When fast reaches end slow will be in the middle of the list
        while(fast.next != null && fast.next.next !=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Split into two list and reverse the second half
        ListNode secondHalf = slow.next;
        slow.next = null; //Break the connection and starts a new list
        secondHalf = reversedList(secondHalf);

        // Step 3: Merge alternately
        ListNode firstHalf = head;
        mergeList(firstHalf, secondHalf);
    }

    private void mergeList(ListNode list1, ListNode list2){
        while(list2!=null){
            ListNode next1 = list1.next;
            ListNode next2 = list2.next;

            list1.next = list2;
            list2.next = next1;

            list1 = next1;
            list2 = next2;
        }
    }

    private ListNode reversedList(ListNode head){

        ListNode prev = null, curr = head, next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next; 
        }

        return prev;
    }
}
