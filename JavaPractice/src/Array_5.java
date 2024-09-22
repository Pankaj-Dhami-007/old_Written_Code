import java.util.Scanner;
public class Array_5 {
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       //int a[] = new int[5];
       System.out.println("Enter the number of integer values:");
       int n = sc.nextInt();
       int arr[] = new int[n];
       
       System.out.println("enter" +n+ "integer");
       for(int i = 0; i<n; i++){
           arr[i] = sc.nextInt();
        }
       System.out.println("Enter element to check position");
       int data= sc.nextInt();
       int index = -1;
       for(int i=0; i<n; i++)
       {
           if(arr[i] == data)
           {
               index = i;
               break;
           }
       }
       System.out.println("found element at index"+index);
    }
}
