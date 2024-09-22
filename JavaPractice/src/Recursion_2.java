import java.util.*;
public class Recursion_2 {
    static int fact(int n)
    {
        if(n == 0)
        {
            return 1;
        }
        int sub = fact(n-1);//sub problem
        int ans = n*fact(n-1);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any no :");
        int n = sc.nextInt();
        int r = fact(n);
        System.out.println(r);
    }
}
