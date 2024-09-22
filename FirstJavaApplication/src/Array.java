import java.util.Scanner;
public class Array {
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       int a[] = new int[5];
       System.out.println("Enter 5 integer values:");
       for(int i = 0; i<5; i++){
           a[i] = sc.nextInt();
       }
       System.out.println("you entered:");
       for(int i = 0; i<5; i++){
           System.out.println(a[i]);
       }
    }
    
}
