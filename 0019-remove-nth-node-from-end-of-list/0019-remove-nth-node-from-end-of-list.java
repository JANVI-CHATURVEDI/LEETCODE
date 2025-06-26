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
        ListNode temp =head; int i=0;ListNode start =head;
        while(temp!=null){
           temp=temp.next;
           i++;
        }
       
        if (i == n) return head.next;


        temp=start;

       while(i>n+1){
         start=start.next;
         i--;
       }
       start.next= start.next.next;

       return temp;
    }
}