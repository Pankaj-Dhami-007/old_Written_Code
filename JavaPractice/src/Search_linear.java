import java.util.*;
public class Search_linear {
    static void search(int arr[],int key)
    {
        int count =0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == key)
            {
               count = i+1;
               break;
            }
                   }
        if(count>0)
        {
            System.out.println("search successful");
            System.out.println("item found at"+" " +count+" "+"position");
        }
            else
            {
                 System.out.println("search unsuccessful");   
                    }
            
 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the Array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter Elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter element to be search:");
        int q = sc.nextInt();
        
        search(arr,q);
    }
}
