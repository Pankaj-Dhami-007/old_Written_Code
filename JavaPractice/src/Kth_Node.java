/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author panka
 */
public class Kth_Node {
    public static class Node{
        int data;
        Node next;
    }
    public static class LL{
        Node head;
        Node tail;
        int size;
        
        public void addLst(int data){
            Node temp=new Node();
            temp.data=data;
            temp.next=null;
            
            if(size==0){
                head=tail=temp;
            }
            else{
                tail.next=temp;
                tail=temp;
            }
            size++;
        }
        
        public int KthNode(int k)
        {
            Node s=head;
            Node f=head;  
            for(int i=0; i<k; i++)
            {
            f=f.next;
            }
            while(f!=null){
                f=f.next;
                s=s.next;
            }
            return s.data;
        }
        
        public void display(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data + " ");
                temp=temp.next;            
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        LL s=new LL();
        s.addLst(10);
        s.addLst(20);
        s.addLst(30);
        s.addLst(40);
        s.display();
        int ans=s.KthNode(2);
        System.out.println(ans);
               
        
    }
}
