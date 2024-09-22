
public class LinkedList {
    public class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public void addFirst(int data)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void display()
    {
        Node temp = head;
        while (temp!=null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
  
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(55);
        ll.addFirst(99);
        ll.display();
        
    }
  
}
