import java.util.*;
public class Array_11 {
    static int find(int arr[],int data,int size)
    {
        int temp = 0;
        for(int i=0; i<size;i++)
        {
            temp = i;
            if(arr[i] == data)
            break;   
        }
        
        return temp;
    }
      public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter any integer");
       int n = sc.nextInt();
       int arr[] = new int[n];
       System.out.println("Entered"+n+"integers");
       for(int i =0; i<n; i++)
       {
           arr[i] = sc.nextInt();
       }
       System.out.println("Given Array is :");
       for(int i =0; i<n; i++)
       {
        System.out.print(" "+arr[i]);   
       }
       System.out.println();
       System.out.println("find element:");
       int p = sc.nextInt();
       
       System.out.println(+p+" is found at index"+" "+find(arr,p,n));
    
    }
}
