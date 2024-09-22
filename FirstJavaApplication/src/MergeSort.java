

public class MergeSort {
    public static void conquer(int arr[], int si,int mid, int ei){
       int merged[] = new int[ei - si + 1];// new arr creation
       //create two index
       int idx1 = si;
       int idx2 = mid+1;
    
       
       int x = 0;//for track merged index
       //sorting
       while(idx1 <= mid && idx2 <= ei) {
           if(arr[idx1] <= arr[idx2]) {
               merged[x] = arr[idx1];
               x++; idx1++;
           } else {
               merged[x] = arr[idx2];
               x++; idx2++;
           }
       } 
       //rest of element which is already sorted. copy
       while(idx1 <= mid) {
            merged[x] = arr[idx1];
               x++; idx1++;
       }
       while(idx2 <= ei) {
         merged[x] = arr[idx2];
               x++; idx2++;  
       }
       //merged element copy into original arr 
       for(int i = 0,j = si; i< merged.length; i++,j++){
        arr[j] = merged[i];
    } 
    }
    // devide
    public static void devide(int arr[], int si, int ei){
        if(si >= ei) {//saare step already performed
            return;
        }
        
        
        int mid = si + (ei - si)/2; // mid calculate
        devide(arr, si, mid);
        devide(arr, mid+1, ei);
        conquer(arr, si, mid, ei); //sorting
    }
    
    public static void main(String args[]) {
        int arr[] = {6, 3, 9, 5, 2, 8};
        int n = arr.length;
        devide(arr, 0, n-1);
        //print
        for(int i = 0; i< n; i++){
            System.out.print(arr[i]+" ");
        }
         System.out.println();
    }
    
}
