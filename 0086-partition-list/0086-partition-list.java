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
    public ListNode partition(ListNode head, int x) {

        ListNode less = new ListNode(0);
        ListNode great = new ListNode(0);

        ListNode lessh = less ;
        ListNode greath = great ;

        while(head != null){
             
             if(head.val < x){
                lessh.next = head ;
                lessh = lessh.next ;

             }
             else{
                greath.next = head;
                greath = greath.next ; 
             }

             head = head.next ;
        }

        lessh.next = great.next ;
        greath.next = null ;

        return less.next ;
        
    }
}