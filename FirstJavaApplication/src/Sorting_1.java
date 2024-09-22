
class Sorting_1 {
public static void main(String arga[]){
    int temp;

    int arr[] = {7,8,3,1,2};
    
    //selection sort
    for(int i = 0; i<=3; i++){
           for(int j = i+1; j<=4; j++){
               if(arr[i] > arr[j]){
                   temp=arr[i];
                   arr[i]=arr[j];
                   arr[j]=temp;
               }
           }
    }
 System.out.println("Sorted:");
       for(int i = 0; i<5; i++){
           System.out.println(arr[i]);
       }

}
}