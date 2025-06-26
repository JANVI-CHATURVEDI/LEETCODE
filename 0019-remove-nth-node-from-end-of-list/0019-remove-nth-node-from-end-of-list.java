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
    public ListNode removeNthFromEnd(ListNode head, int n) {
    //     ListNode temp =head; int i=0;ListNode start =head;
    //     while(temp!=null){
    //        temp=temp.next;
    //        i++;
    //     }
       
    //     if (i == n) return head.next;


    //     temp=start;

    //    while(i>n+1){
    //      start=start.next;
    //      i--;
    //    }
    //    start.next= start.next.next;

    //    return temp;


    // most optimised using two pointer

   
        ListNode dummy = new ListNode(0, head);
        ListNode fast = dummy, slow = dummy;

        // Move fast n+1 steps ahead
        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }

        // Move both until fast reaches the end
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        // Delete the nth node from end
        slow.next = slow.next.next;

        return dummy.next;

 
    }
}