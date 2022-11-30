//{ Driver Code Starts
import java.util.*;

class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}

  public class ReorderList {
    Node head; // head of lisl
    Node last; // last of linked list

    /* Linked list Node*/

    /* Utility functions */

    /* Inserts a new Node at front of the list. */
    public void addToTheLast(Node node) {

        if (head == null) {
            head = node;
            last = head;
        } else {
            // Node temp = head;
            // while (temp.next != null) temp = temp.next;

            last.next = node;
            last = last.next;
        }
    }
    /* Function to print linked list */
    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    /* Drier program to test above functions */
    public static void main(String args[]) {

        /* Constructed Linked List is 1->2->3->4->5->6->
           7->8->8->9->null */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            ReorderList llist = new ReorderList();

            int a1 = sc.nextInt();
            Node head = new Node(a1);
            llist.addToTheLast(head);
            for (int i = 1; i < n; i++) {
                int a = sc.nextInt();
                llist.addToTheLast(new Node(a));
            }

            llist.head = new Solution().reorderlist(llist.head);

            llist.printList();

            t--;
        }
    }
}
// } Driver Code Ends


/* Following is the Linked list node structure */

/*class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}*/

class Solution {
    Node reorderlist(Node head) {
        int n = 0;
        Node cur = head;
        while (cur != null) {
            n++;
            cur = cur.next;
        }

        Node head1 = head;
        Node head2 = head;
        Node prev = null;
        int w = n / 2;
        if (n % 2 == 1) {
            w++;
        }
        for (int i = 0; i < w; i++) {
            prev = head2;
            head2 = head2.next;
        }
        if (prev != null) {
            prev.next = null;
        }
        head2 = reverse(head2);
        cur = head1;
        for (int i = 0; i < n / 2; i++) {
            Node temp = cur.next;
            cur.next = head2;
            Node temp2 = head2.next;
            head2.next = temp;
            cur = temp;
            head2 = temp2;
        }
        return head1;
    }
    Node reverse(Node head) {
        Node cur = head;
        Node prev = null;
        while (cur != null) {
            Node temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }
        return prev;
    }
}
