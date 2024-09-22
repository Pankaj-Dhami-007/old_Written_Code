import java.util.*;
public class NOPrint {
    public static void printNum(int n){
        for (int i = 0; i < n; i++) {
            int num =1;
            for (int j = 0; j <= i; j++) {
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
    static void printN(int n){
        int k =1;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(k++ +" ");
            }
            System.out.println();
        }
    }
       public static void main(String[] args) {
          int n = 5;
          printNum(n);
           System.out.println();
           printN(n);
    }
 
}
