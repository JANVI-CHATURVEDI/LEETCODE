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
        ListNode dummy=new ListNode();
        ListNode current = dummy;
        int carry = 0;

        while( l1!=null || l2!=null){
            int var1 = (l1 != null) ? l1.val : 0;
            int var2 = (l2 != null) ? l2.val : 0;

            
            int sum = var1+var2+carry;
             carry=sum/10;
            int data = sum % 10;
            
            current.next=new ListNode(data);
            current = current.next;


            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;


        }

        if(carry > 0){
            current.next=new ListNode(carry);
        }
       

       return dummy.next;
    }
}