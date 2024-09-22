import java.util.*;

/**
 *
 * @author panka
 */
public class Paractice {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        int arr[]=new int[n];
        
       for(int i=0; i<arr.length; i++){
           arr[i]=sc.nextInt();
       }
       
        System.out.println("enter val to be searched");
       int k=sc.nextInt();
       
      int ans= findkth(arr,k);
        System.out.println(ans);
              
       
    }
    
    static int findkth(int arr[],int k){
        Arrays.sort(arr);
        
        for(int i=arr.length-1; i>=0; i--){
            return arr[k-1];
        }
        return -1;
    }
    
            
    
}
