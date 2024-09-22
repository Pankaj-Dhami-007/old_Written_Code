import java.util.*;

public class Array_3 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("No of elements :");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter"+n+"integers");
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Entered");
        for(int i=0; i<n; i++)
        {
            System.out.println(arr[i]);
        }
    }
}
