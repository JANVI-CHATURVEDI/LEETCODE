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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       ListNode node = helper(l1 , l2 , 0) ;

       return node ;
    }

    public ListNode helper( ListNode l1, ListNode l2 , int carry ) {

        if(l1 == null && l2 == null && carry == 0 ) return null ;
        
        int sum = 0 ;
        if (l1 != null ) sum += l1.val ;
        if (l2 != null ) sum += l2.val ;
        sum += carry ;

        ListNode node = new ListNode( sum % 10 ) ;
        carry = sum / 10 ;

        node.next = helper( (l1 != null) ? l1.next : null,
                            (l2 != null) ? l2.next : null ,
                            carry
                           ) ;

        return node ;

    }

}