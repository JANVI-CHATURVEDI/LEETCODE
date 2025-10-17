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
        return addHelper(l1, l2, 0);
    }

    private ListNode addHelper(ListNode l1, ListNode l2, int carry) {
        // base case: both lists are null and no carry
        if(l1 == null && l2 == null && carry == 0) return null;

        int sum = carry;
        if(l1 != null) sum += l1.val;
        if(l2 != null) sum += l2.val;

        ListNode node = new ListNode(sum % 10); // current digit
        carry = sum / 10; // carry for next recursion

        // recursive call for next nodes
        node.next = addHelper(
            (l1 != null) ? l1.next : null,
            (l2 != null) ? l2.next : null,
            carry
        );

        return node;
    }
}
