

public class Array_10 {
    public static int SecondLargest(int arr[],int size)
    {
        int temp;
        for(int i =0; i<size;i++)
        {
            for(int j = i+1;j<size; j++)
            {
                if(arr[i] >arr[j])
                {
                   temp = arr[i];
                   arr[i]=arr[j];
                   arr[j] = temp;
                }
            }
        }
        return arr[size-2];
    }
    public static void main(String args[])
    {
        int arr[] = {1,8,3,4,5,6,7,2,9};
        System.out.println("Array is :");
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int result = SecondLargest(arr,9);
        System.out.println("second largest element is "+" "+result);
    }
    
}
