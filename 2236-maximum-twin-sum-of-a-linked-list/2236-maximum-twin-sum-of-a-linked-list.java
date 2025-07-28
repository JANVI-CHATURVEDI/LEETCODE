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
    public int pairSum(ListNode head) {
         int max = 0 , sum =0 ;
        ListNode right = mid(head);

       ListNode righthalf = reverse(right);
       ListNode lefthalf = head;

       while(righthalf != null && lefthalf != null){
        sum = lefthalf.val + righthalf.val ;
        max = Math.max(max , sum);
        sum = 0;
        lefthalf = lefthalf.next;
        righthalf = righthalf.next;
       }
      
      return max ;
    }
    public ListNode reverse (ListNode head){
      ListNode cur = head;
      ListNode prev = null;

      while(cur != null){
        ListNode temp = cur.next;
        cur.next = prev;
        prev = cur;
        cur = temp;

      }

      return prev;
    }
    public ListNode mid(ListNode head){
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}