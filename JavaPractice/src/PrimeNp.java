import java.util.*;
public class PrimeNp {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any no :");
        int p = sc.nextInt();
        System.out.println("Entered :");
        for(int i =0; i<p; i++)
        {
            int q = sc.nextInt();
            int count =0;
            for(int div = 1; div<=q; div++)
            {
                if(q%div == 0)
                {
                    count++;
                }
            }
            if(count == 2)
            {
              System.out.println("Prime");  
            }
            else
            {
             System.out.println("not Prime");     
            }
        }
        
    }
}
