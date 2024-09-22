import java.util.Scanner;
class Practice {
    int add(){
        int a = 10, b = 33; //local variable
        return(a+b);
    }
}

public class PracticeQ {
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        disp(n);
        demo(n, 0);
        Practice p = new Practice();
        int r = p.add();
        System.out.println(r);
    }
   
    static void disp(int n)
     {
        
        System.out.println("Entered "+ n + " integers: ");
        for(int i = 1; i <=n; i++)
        {
            System.out.println(2*i-1);
        }
        
    }
    static void demo(int n, int sum){
        
       System.out.println("Sum of " + n + " integer: ");
        for(int i = 1; i <= n; i++){
            
            sum = sum + i;   
        }
        System.out.println(sum);
    }           
    
}
