
public class Array_14 {
    
    static int secondL(int arr[]){
          int n = arr.length;
          int max = arr[0];
          for (int i = 1; i < n; i++) {
              if(arr[i]> max){
                  max = arr[i];
              }
          }
          int secondMax = arr[0];
          for (int i = 0; i < n; i++) {
            if(arr[i]>secondMax && arr[i] != max){
                secondMax = arr[i];
            }
        }
          return secondMax;
      }
    public static void main(String[] args) {
        int arr[] = {33, 22, 5, 0, 1, 9, 2, 77, 8};
        int r = secondL(arr);
        System.out.println(r);
    }
  
}
