//import java.util.*;

public class Array_1 {
    public static void dublicate(int[] arr)
    {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for(int j = i+1; j<n; j++)
            {
              if(arr[i] == arr[j])
              {
                  System.out.println("duplicate Element is:"+arr[i]);  
              }
            }
        }
    }
    public static void main(String args[]){
        int[] arr ={1, 2, 3, 4, 2, 1, 5, 5};
        dublicate(arr);
        }
    
}
