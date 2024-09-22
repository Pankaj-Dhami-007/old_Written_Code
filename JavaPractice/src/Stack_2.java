import java.util.Scanner;
import java.util.Stack;
public class Stack_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        int n;
        System.out.println("Enter no of element:");
        n = sc.nextInt();
        System.out.println("Enter the elements:");
        for (int i = 1; i <= n; i++) {
            int x = sc.nextInt();
            st.push(x);
        }
        System.out.println(st);
        Stack<Integer> rt = new Stack<>();
        while (st.size()>0) {
            int x = st.peek();
            rt.push(x);
            st.pop();
        }
        System.out.println(rt);
    }
}
