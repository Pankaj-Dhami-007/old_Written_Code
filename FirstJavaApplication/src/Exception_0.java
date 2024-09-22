import java.util.Scanner;

public class Exception_0 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no A:");
        int a = sc.nextInt();
        System.out.println("Enter a no B:");
        int b = sc.nextInt();
        try{
        int c = a/b;
        System.out.println("division = "+c);
        }
        catch(ArithmeticException e)
        {
           System.out.println("division is not possible"); 
        }
        System.out.println("End program"); 
    }
}
