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
        
        ListNode slow = head ;
        ListNode fast = head ;

        while( fast != null && fast.next != null ){
            slow = slow.next ;
            fast = fast.next.next ;
        }

        if (fast != null) {
            slow = slow.next;
        }
        
        ListNode curr = slow ;
        
        ListNode prev = null ;

        while(curr != null ){
            ListNode temp = curr.next ;
            curr.next = prev ;
            prev = curr ;
            curr = temp ;
        }

        ListNode first = head ;
        ListNode second = prev ;

        while(first != null && second != null){
            
            if(first.val == second.val){
               first = first.next ;
               second = second.next ;
            }
            else{
                return false ;
            }
        }

      return true ;
    }
}