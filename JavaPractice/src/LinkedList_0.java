

public class LinkedList_0 {
    public static class node{
        int data;
        node next;
        node(int data)
        {
            this.data = data;
            
        }
    }
        static void display(node head)
    {
        node temp = head;
        while (temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    static void displayR(node head)
    {
        node temp = head;
        if (head == null) {
            return;
        }
        System.out.print(temp.data+" ");
        displayR(temp.next);
    }
    static int len(node a)
    {
        node temp = a;
        int count = 0;
        while(temp != null)
        {
            count++;
            temp = temp.next;
        }
        return count;
    }
    static void revLlist(node head)
    {
        node p = head;
        if(p != null)return;
        
            revLlist(p.next);
            System.out.print(p.data+" ");
        
    }
    public static void main(String[] args) {
        node a = new node(5);
        node b = new node(3);
        node c = new node(6);
        node d = new node(45);
        a.next = b;
        b.next= c;
        c.next = d;
        revLlist(a); 
        display(a);
        System.out.println();
        displayR(a);
        System.out.println("length is :"+len(a));
        System.out.println("reverse linked list is :");
          
            }
}
