import java.util.Scanner;
public class Prime {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n, i;
        System.out.println("Enter a number: ");
        n = sc.nextInt();
        for( i = 2; i <= n-1; i++){
            if(n % i == 0)
            {
                break;
                        }
        }
            if(i == n)
            {
              System.out.println("Number is prime: ");  
            } else
            {
             System.out.println("Number is not prime: ");     
            }
        
    }
    
}
