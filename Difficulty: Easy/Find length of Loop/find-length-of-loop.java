//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

public class LinkedList {
    public static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    public static void makeLoop(Node head, Node tail, int x) {
        if (x == 0) return;

        Node curr = head;
        for (int i = 1; i < x; i++) curr = curr.next;

        tail.next = curr;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            ArrayList<Integer> arr = new ArrayList<>();
            String input = br.readLine();
            StringTokenizer st = new StringTokenizer(input);
            while (st.hasMoreTokens()) {
                arr.add(Integer.parseInt(st.nextToken()));
            }
            int k = Integer.parseInt(br.readLine());
            Node head = new Node(arr.get(0));
            Node tail = head;
            for (int i = 1; i < arr.size(); ++i) {
                tail.next = new Node(arr.get(i));
                tail = tail.next;
            }
            makeLoop(head, tail, k);

            Solution ob = new Solution();
            System.out.println(ob.countNodesinLoop(head));

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


/*

class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}

*/
// Function should return the length of the loop in LL.

class Solution {
    // Function to find the length of a loop in the linked list.
    public int countNodesinLoop(Node head) {
        Node startpoint = detectCycle(head); // Detect the cycle using the detectCycle method
        if (startpoint == null) {
            return 0; // No cycle detected, return 0
        }
        
        int s = 1; // At least one node in the cycle
        
        // Start counting from the start point in the cycle
        Node current = startpoint.next; // Start from the node after the starting point
        
        // Count the nodes in the cycle
        while (current != startpoint) {
            s++;
            current = current.next;
        }
        
        return s; // Return the length of the cycle
    

    }
    
    public Node detectCycle( Node head) {
        if( head == null || head.next == null){
            return null;
        }
     Node meet = hasCycle(head);

     if (meet == null) {
            return null; // No cycle detected
        }
        Node start = head;

        

        while(start != meet ){
            start= start.next;
            meet = meet.next;

        }
        return start;
    }
    
    public Node hasCycle(Node head) {
      Node slow = head;
      

  
    
    
        Node fast = head;


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
