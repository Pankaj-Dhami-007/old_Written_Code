
public class Recursion {
    public static void PrintNum(int n){
        // base case
        if(n == 0) {
            return;
        }
        System.out.println(n);
        PrintNum(n-1);// step
    }
    public static void main(String args[]){
        int n = 5;
       PrintNum(n); // n = 5 
    }
    
}
