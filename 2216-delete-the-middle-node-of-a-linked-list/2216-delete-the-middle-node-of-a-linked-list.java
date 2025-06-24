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
    public ListNode deleteMiddle(ListNode head) {
        ListNode prev = head;
        int n = getLength( head);

        if (head == null || head.next == null) {
            return null;
        }
        

            for(int i=0;i< (n/2)-1 ; i++){
                prev=prev.next;

            }

            prev.next=prev.next.next;

       return head;

    }

    int getLength(ListNode head) {
    int count = 0;
    ListNode current = head;

    while (current != null) {
        count++;
        current = current.next;
    }

    return count;
}
}