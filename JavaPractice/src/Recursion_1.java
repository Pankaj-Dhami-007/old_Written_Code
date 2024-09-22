import java.util.*;
public class Recursion_1 {
    static void printInc(int n)
{
      if(n == 1)
      {
          System.out.println(1);
          return;
      }
      printInc(n-1);
      System.out.println(n);
}

    static void printDec(int n)
    {
        if(n == 1)
        {
            System.out.println(1);
            return;
        }
        System.out.println(n);
        printDec(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integer:");
        int n = sc.nextInt();
        printInc(n);
        System.out.println("Enter integer:");
        int m = sc.nextInt();
        printDec(m);
    }
}
