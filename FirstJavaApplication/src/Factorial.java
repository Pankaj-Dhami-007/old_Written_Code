import java.util.Scanner;
public class Factorial {
    public static void main(String args[]){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        n = sc.nextInt();
        disp(n);
        
    }
    static void disp(int n)
    {
        int temp = 1;
        for(int i = n; i>=1 ; i--){
        temp = temp * i;
        }
       System.out.println("Factorial: "+temp);  
    }
}
