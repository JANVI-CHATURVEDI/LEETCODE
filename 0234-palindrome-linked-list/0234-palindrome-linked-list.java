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
    public boolean isPalindrome(ListNode head) {
      if(head==null){
        return true;

      }  
      ListNode mid= middleNode (head);
      ListNode last = reverseList (mid);

       ListNode cur =head;
       while(last != null){
        if(last.val !=cur.val){
            return false;
        }
        last = last.next;
        cur=cur.next;
       }
      return true;
    }

    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

     public ListNode reverseList(ListNode head) {

        ListNode cur= head;
        ListNode prev= null;

        while(cur!= null){
            ListNode temp= cur.next;
            cur.next= prev;
             prev= cur;
             cur= temp;

        }
        return prev;
        
    }
}