
public class SecondMin {
    public static void sMinimum(int[] arr)
    {
        int n = arr.length;
        int first,second;
        first = Integer.MAX_VALUE;
        second = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if(arr[i] < first)
            {
                first = arr[i];
            }
        }
        System.out.println("Min element is "+first);
    }
    public static void main(String[] args) {
        int []num = {-10, -2, -9, 2, 0, 8,-1}; 
        sMinimum(num);
    }
}
