
public class LinkedList_2 {
    public static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
        }
    }
    public static class LinkedList{
        Node head = null;
        Node tail = null;
        void insertAtend(int val)
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
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println();
        }
        void len()
        {
            Node temp = head;
            int count = 0;
            while (temp != null) {
                temp = temp.next;
                count++;
            }
            System.out.println(" "+count);
        }
    }
    
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertAtend(5);// 5
        ll.insertAtend(6);//6
        //ll.size();
        ll.display();
        ll.len();
    }
    }
