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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        ListNode head1 = list1;
        ListNode head2 = list2 ;

        while(head1 != null && head2 != null){
             
            if(head1.val <= head2.val){
                tail.next = head1;
                tail = tail.next ;
                head1 = head1.next;
            }
            else{
                tail.next = head2;
                tail = tail.next ;
                head2 = head2.next;
            }


        }

        while(head1 != null || head2 != null){
            if(head1 != null ){
                tail.next = head1;
                tail = tail.next ;
                head1 = head1.next;
            }
            else{
                tail.next = head2;
                tail = tail.next ;
                head2 = head2.next;
            }
        }

       return dummy.next ; 
        
    }
}