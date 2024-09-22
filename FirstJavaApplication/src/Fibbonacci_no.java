 import java.util.Scanner;
public class Fibbonacci_no {
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int n,i, a=-1, b =1, c;
      System.out.println("enter a value:");
      n = sc.nextInt();
      for(i =1; i<=n; i++){
          c = a + b;
          System.out.println(c);
          a = b;
          b = c;
      }
      
    }
    
    
}
