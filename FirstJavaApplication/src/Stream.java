public class Stream {
    public static void print(int num[]){
        int n = num.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                //Print from i to j
                for (int k = i; k <= j; k++) {
                    System.out.print(num[k] +" ");
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        print(arr);
    }
    
}
