
public class LinkedList4 {
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
        int size =0;
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
        void deleteAt(int idx)
        {
            Node temp = head;
             for (int i = 0; i < idx-1; i++) {
                temp = temp.next;
            }
             temp.next = temp.next.next;
             tail = temp;
             size--;
        }
        int size()
        {
          Node temp = head;
          int count =0;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            return count;
        }
 }
    public static void main(String[] args) {
       List ll = new List();
        ll.create(5);
        ll.create(7);
        ll.create(55);
        ll.create(50);
        ll.create(15);
        ll.display();
        System.out.println();
        ll.deleteAt(3);
        ll.display();
        
 
    }
}
