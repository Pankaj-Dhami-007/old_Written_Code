import java.util.*;
public class Array_13 {
    
     static int pairsSum(int num[], int sum)
     {
         
         int n = num.length;
         int ans =0;
   
         for (int i = 0; i < n; i++) {
             for (int j = i+1; j < n; j++) {
                 if(num[i] + num[j] == sum)
                 {
                   ans++;  
                 }
             }
         }
         return ans;
     }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size :");
        int n = sc.nextInt();
         System.out.println("pairs sum");
         int sum = sc.nextInt();
        int num[] = new int[n];
        for (int i = 0; i < n; i++) {
           num[i] = sc.nextInt(); 
        }
        int r = pairsSum(num,sum);
         System.out.println(r);
     }
}
