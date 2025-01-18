class ListNode {
     int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }

       public static ListNode deserialize(String data) {
        if (data == null || data.isEmpty()) {
            return null; // Return null for empty input
        }

        // Remove square brackets and split by commas
        data = data.replaceAll("[\\[\\]]", ""); // Remove square brackets
        String[] values = data.split(",");

        ListNode dummy = new ListNode(0); // Dummy node for easy list creation
        ListNode current = dummy;

        for (String value : values) {
            value = value.trim(); // Remove extra spaces
            if (!value.equals("null") && !value.isEmpty()) { // Ignore "null"
                current.next = new ListNode(Integer.parseInt(value));
               // current.next = new ListNode(Integer.parseInt(value)) creates a new node with the integer value of value and attaches it to the current node's next pointer.
                current = current.next;
            }
        }

        return dummy.next; // Return the actual list (skipping the dummy)
    }
}
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if( head == null || head.next == null){
            return null;
        }
     ListNode meet = hasCycle(head);

     if (meet == null) {
            return null; // No cycle detected
        }
        ListNode start = head;

        

        while(start != meet ){
            start= start.next;
            meet = meet.next;

        }
        return start;
    }

     public ListNode hasCycle(ListNode head) {
      ListNode slow = head;
        ListNode fast = head;

        while( fast != null && fast.next != null ){
            slow=slow.next;
            fast = fast.next.next;

            if( slow == fast){
                return slow;

            }
        }
        return null;   
    }
}

 