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
        ListNode curr1 = l1;
        ListNode curr2 = l2;
        ListNode ans = new ListNode(0);
        ListNode anst = ans;
        int carry = 0;


        while(curr1 != null || curr2 != null || carry != 0){
            int value = carry;

            if( curr1 != null){
                value += curr1.val;
                curr1 = curr1.next;
            }

            if( curr2 != null){
                value += curr2.val;
                curr2 = curr2.next;
            }
            

            int digit = value % 10;
            carry = value / 10;
            ListNode temp = new ListNode(digit);
            anst.next = temp;
            anst = anst.next;

        }

        return ans.next;
        
    }
}