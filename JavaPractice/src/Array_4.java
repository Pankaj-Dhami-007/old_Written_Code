import java.util.Scanner;
public class Array_4 {
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       //int a[] = new int[5];
       System.out.println("Enter the number of integer values:");
       int n = sc.nextInt();
       int arr[] = new int[n];
       int sum = 0;
       System.out.println("enter" +n+ "integer");
       for(int i = 0; i<n; i++){
           arr[i] = sc.nextInt();
           sum = sum+arr[i];
       }
       
       System.out.println(sum);
    }
    
}
