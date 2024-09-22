
import java.util.Scanner;
public class Sorting {
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       int temp;
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
      
       for(int i = 0; i<=n-1; i++){
           for(int j = i+1; j<=4; j++){
               if(arr[i] > arr[j]){
                   temp=arr[i];
                   arr[i]=arr[j];
                   arr[j]=temp;
               }
           }
       }
       
        System.out.println("Sorted:");
       for(int i = 0; i<n; i++){
           System.out.println(arr[i]);
       }
    }
    
}
