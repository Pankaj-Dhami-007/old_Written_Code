import java.util.*;
public class Recursion_4 {
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
        int ans = prev+preprev;
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter any no :");
        int n = sc.nextInt();
        int r = fibonacci(n);
        for (int i = 0; i <= n; i++) {
            System.out.println(fibonacci(i));
        }
    }
}
