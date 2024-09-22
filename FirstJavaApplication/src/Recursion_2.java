

public class Recursion_2 {
    public static void PrintSum(int i, int n, int sum){//int n base condition
        if(i == n){
            sum = sum + i;
            System.out.println(sum);
            return; // ?  
        }
        sum = sum + i;
        PrintSum(i+1, n, sum);
        
    }
    public static void main(String args[]) {
        int i = 1, n=5, sum = 0;
        PrintSum(i, n, sum);
        
        
    }
    
}
