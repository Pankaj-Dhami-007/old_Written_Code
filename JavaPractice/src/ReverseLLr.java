public class ReverseLLr {
    public static class Node {

        int val;
        Node next;

        Node(int val) {
            this.val = val;

        }
    }
public static Node reverseLL(Node head)
{
    Node curr = head;
    Node prev = null;
    Node  after= null;
    while (curr != null) {
        after = curr.next;
        curr.next = prev;
        prev = curr;
        curr = after;
    }
    return prev;
}
public static void displayLL(Node head) {
        if (head == null) {
            System.out.println();
            return;
        }
        System.out.print(head.val + " ");
        displayLL(head.next);
    }

    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(5);
        Node c = new Node(1);
        Node d = new Node(2);
        Node e = new Node(4);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = null;
        displayLL(a);
        a = reverseLL(a);
        displayLL(a);

    }
}
