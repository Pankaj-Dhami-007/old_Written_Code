import java.util.Scanner;
public class Char1D {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        char a[] = new char[5];
        System.out.println("Enter five charactor:");
        for(int i = 0; i<5; i++)
        {
          a[i] = sc.next().charAt(0);
        }
         System.out.println("You Entered: ");
         for(int i =0; i<5; i++)
         {
         System.out.println(a[i]);    
         }
        
    }
}
