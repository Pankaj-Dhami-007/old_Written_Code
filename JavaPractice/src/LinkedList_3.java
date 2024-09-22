
public class LinkedList_3 {
    public static class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
        }
    }
    public static class List{
        Node head = null;
        Node tail = null;
        void create(int val)
        {
            Node temp = new Node(val);
            if(head == null)
            {
                head = temp;
            }
            else
            {
                tail.next = temp;
            }
            tail = temp;
        }
        void display()
        {
            Node temp = head;
            while (temp != null) {
                System.out.print(" "+temp.data);
                temp = temp.next;
            }
            System.out.println();
        }
        void insertAtMid(int idx, int val)
        {
            Node n = new Node(val);
            Node temp = head;
            for (int i = 1; i <= idx-1; i++) {
               temp = temp.next;
            }
            n.next = temp.next;
            temp.next = n;
        }
    }
    public static void main(String[] args) {
        List ll = new List();
        ll.create(5);
        ll.create(7);
        ll.create(55);
        ll.create(50);
        ll.create(15);
        ll.insertAtMid(2,88);
        ll.display();
        
    }
}
