
public class LinkedList5 {
    public static class listNode{
        int data;
        listNode next;
        listNode(int val)
        {
            this.data = val;
        }
    }
    public static listNode thNode(listNode head, int n)
    {
       listNode slow = head;
       listNode fast = head;
        for (int i = 1; i <= n; i++) {
            fast = fast.next;
        }
        while (fast!=null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
    public static listNode nthNode(listNode head, int n)
    {
      int size =0;
      listNode temp = head;
        while (temp!=null) {
           size++;
           temp = temp.next;
        }
        int q = size - n +1;
        temp = head;
        for (int i = 0; i < q-1; i++) {
            temp = temp.next;
        }
        return temp;
    }
    public static void main(String[] args) {
        listNode a = new listNode(33);
        listNode b = new listNode(23);
        listNode c = new listNode(43);
        listNode d = new listNode(77);
        listNode e = new listNode(99);
        listNode f = new listNode(100);
        listNode g = new listNode(20);
        a.next =b;
         b.next =c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = null;
        listNode temp = nthNode(a,4);
        System.out.println(temp.data);
        System.out.println();
        listNode q = thNode(a,3);
        System.out.println(q.data);
    }
}
