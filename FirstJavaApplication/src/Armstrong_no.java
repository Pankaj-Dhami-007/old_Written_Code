import java.util.Scanner;

// write a program to check whether a number is armstrong or not? ex = 153
public class Armstrong_no {
    public static void main(String args[]) {
        int n, digit, i, prod , sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        n = sc.nextInt();
        // no of digit count
        int z = n;
        int count = 0;
        while(z > 0)
        {
            z = z / 10;
            count++;
        }
       System.out.println("no of digits="+count); 
       
       // cube of each digit
       z = n;
       while(z > 0)
       {
        digit = z % 10;
        prod = 1;
        for(i =1; i <= count; i++)
        {
         prod = prod * digit;
        }
         // sum of each cube number
         sum = sum + prod;
         z = z/10;
    
       }
       if(sum == n)
       {
        System.out.println("its armstrong no: ");   
       }  else
        {
          System.out.println("its not armstrong no: ");     
        }
 
    }
    
}
