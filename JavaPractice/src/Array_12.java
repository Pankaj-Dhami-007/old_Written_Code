import java.util.*;
public class Array_12 {
    static int pairs(int num[])
    {
        int n = num.length;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(num[i] == num[j])
                {
                    num[i] = -1;
                    num[i] = -1;
                }
            }
        }
        int ans = -1;
        for (int i = 0; i < n; i++) {
            if(num[i]>0)
            {
                ans = num[i];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size :");
        int n = sc.nextInt();
        int num[] = new int[n];
        for (int i = 0; i < n; i++) {
           num[i] = sc.nextInt(); 
        }
        int r =pairs(num);
        System.out.println("Tne no is :"+r);
    }
}
