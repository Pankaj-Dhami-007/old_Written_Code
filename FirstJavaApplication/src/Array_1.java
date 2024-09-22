import java.util.Scanner;
public class Array_1 {
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
       System.out.println("you entered:");
       for(int i = 0; i<n; i++){
           System.out.println(arr[i]);
       }
    }
    
}
