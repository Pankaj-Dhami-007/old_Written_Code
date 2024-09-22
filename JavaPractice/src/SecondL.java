
public class SecondL {
    public static void sLargest(int arr[]){
        int n = arr.length;
        int first,second;
        first = -1;
        second = -1;
        for (int i = 0; i < n; i++) {
            if(arr[i] > first)
            {
                first = arr[i];
            }
        }
        System.out.println("largest no is"+" "+first);
        for (int i = 0; i < n; i++) {
            if(arr[i] > second && arr[i] != first){
                second = arr[i];
            }
        }
        System.out.println("second Largest element is "+" "+second);
    }
    public static void main(String[] args) {
        int[] arr = {7,9,1,3,2,6,11};
        sLargest(arr);
    }
 
}
