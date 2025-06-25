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
       

        if(head.next.next == null){
            return head.val + head.next.val;
        }
      ListNode mid= middleNode (head);
      ListNode last = reverseList (mid);
       ListNode first=head ;ListNode second =last;
       int fsum =0 ;int ssum=0;int max=0,mmax=0;
       
       while(  second != null){
            fsum = first.val;
            ssum = second.val;

            first = first.next;
            second = second.next;

             max =  Math.max(max , fsum+ssum);
            
       }
         
      
       return max;
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