import java.util.*;
public class Recursion_3 {
    static int fibonacci(int n)
    {
        if(n == 0 || n == 1)
        {
            return n;
        }
        //small problem
        int prev = fibonacci(n-1);
        int preprev = fibonacci(n-2);
        //self work
        int ans = fibonacci(n-1)+fibonacci(n-2);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter any no :");
        int n = sc.nextInt();
        int r = fibonacci(n);
        System.out.println(r);
    }
}
