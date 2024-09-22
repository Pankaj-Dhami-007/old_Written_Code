import java.util.*;
public class Search_binary {
    static int binarySearch(int arr[], int key)
    {
        int n = arr.length;
        int low = 0;
        int high = n-1;
        while (low<=high) {
            int mid = (low+high)/2;
            if(key == mid)
            {
              return mid;  
            }
            else if(key> mid)
            {
              low = mid+1;  
            }
            else
            {
              high = mid-1;  
            }
        }
        return -1;
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
        int s=binarySearch(arr,q);
        System.out.println(s);             
        
    }
  
}
