
public class Array_9 {
    public static void main(String args[])
    {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        System.out.println("Array is :");
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Array in reverse ordedr :");
        for(int i = arr.length-1; i>=0; i--)
        {
          System.out.print(arr[i]+" ");  
        }
        
    }
}
