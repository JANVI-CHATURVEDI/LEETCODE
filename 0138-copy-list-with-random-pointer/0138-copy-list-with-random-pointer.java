/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        HashMap <Node, Node> map = new HashMap <>();
        Node currh = new Node(0);
        Node newtemp = currh;;
        Node temp = head;

        while(temp != null){
            Node curr = new Node(temp.val);
            newtemp.next = curr ;
            map.put(temp , newtemp.next);
            newtemp = newtemp.next;
            temp = temp.next;

        }

        temp = head;
        Node curr = currh.next;

        while(temp != null){
            curr.random = map.get(temp.random);
            temp = temp.next;
            curr = curr.next;
        }
        
        return currh.next;

    }
}