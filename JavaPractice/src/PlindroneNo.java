
public class PlindroneNo {
    public static class Node{
        int val;
        Node next;
        Node(int val)
        {
            this.val = val;
        }
    }
    public static void displayLL(Node head) {
        if (head == null) {
            System.out.println();
            return;
        }
        System.out.print(head.val + " ");
        displayLL(head.next);
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
    
    public static boolean isPalindrome(Node head){
        Node slow = head;
        Node fast = head;
         while (fast.next != null && fast.next.next !=null) {
            slow = slow.next; //slow = middle
            fast = fast.next.next;
        }
        // slow.next wale part ko reverse krna h
        Node temp = reverseLL(slow.next);
        slow.next = temp;// add
        //now compare
        Node p1 = head;
        Node p2 = slow.next;
        while (p2!=null) {
            if(p1.val != p2.val) return false;
            p1 = p1.next;
            p2 = p2.next;
        }
        return true;
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(3);
        Node f = new Node(4);
        Node g = new Node(1);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = null;
        displayLL(a);
        
        System.out.println(isPalindrome(a));
    }
}
