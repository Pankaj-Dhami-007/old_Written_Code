//removing nth node frm the end of LinkedList in one traversal
public class LinkedList6 {
    public static class Node{
        int data;
        Node next;
        Node(int val)
        {
            this.data = val;
        }
    }

    public static void nthNode(Node head, int n)
    {
        Node slow = head;
        Node fast = head;
        for (int i = 1; i <= n; i++) {
          fast = fast.next;  
        }
        //for head node
        if(fast == null)
        {
            head = head.next;
            return;
        }
        while (fast.next!=null) {
          slow = slow.next;
          fast = fast.next;
        }
        slow.next = slow.next.next;
    }
    public static void display(Node head)
        {
            Node temp = head;
            while (temp != null) {
                System.out.print(" "+temp.data);
                temp = temp.next;
            }
            System.out.println();
        }
    public static void main(String[] args) {
        Node a = new Node(33);
        Node b = new Node(23);
        Node c = new Node(43);
        Node d = new Node(77);
        Node e = new Node(99);
        Node f = new Node(100);
        Node g = new Node(20);
        a.next =b;
         b.next =c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = null;
        nthNode(a,3);
        display(a);

    }
}
