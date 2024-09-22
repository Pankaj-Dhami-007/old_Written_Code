

public class Linkedlist_1 {
    public static class node{
        int data;
        node next;
        node(int data)
        {
            this.data = data;
        }
    }
       public static void revLlist(node head)
    {
        
        if(head == null)return;//base
        
            revLlist(head.next);//call
            System.out.print(head.data+" ");//self work
        
    }
    public static void main(String[] args) {
        node a = new node(5);
        node b = new node(3);
        node c = new node(6);
        node d = new node(45);
        a.next = b;
        b.next= c;
        c.next = d;
        d.next = null;
        System.out.println("reverse linked list is :");
        revLlist(a);
          
            }
}

