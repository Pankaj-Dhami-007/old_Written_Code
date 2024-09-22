
public class InsertSort {
    public static void printArry(int arr[] , int n)
    {
        for(int i =0; i< n; i++)
        {
            System.out.print(" "+arr[i]);
        }
    }

    public static void main(String args[])
    {
         int arr[] =  {7, 8, 3, 1, 2};
         int n = arr.length;
         System.out.println("Array Size = "+arr.length);
         printArry(arr, n);
         System.out.println();
         //insert sort
         
         for(int i = 1; i<n; i++)
         {
           int current = arr[i];
           int j = i-1;
           //push 
           while(j >= 0 && current < arr[j])
           {
             arr[j+1] = arr[j];
             j--;
           }
           //placement
           arr[j+1] = current;
         }
         printArry(arr, n);
    }
        
}
