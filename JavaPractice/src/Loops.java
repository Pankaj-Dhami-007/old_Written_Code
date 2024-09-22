
import java.util.*;

public class Loops {
    
/*static int digCount(int num)
{
    int nod = 0;
    while (num!=0) {
      num = num/10;
      nod++;
    }
    return nod;
}
*/
/*static int nodSum(int data)
{
   int temp = data;
   int sum = 0;
    while (temp!=0) {
        sum = sum + temp%10;
        temp = temp/10;
    }
    return sum;
}
*/
    /*static int reverse(int num)
    {
        int ans =0;
        while (num!=0) {
            ans = ans*10 + num%10;
            num/=10;
        }
        return ans;
    }
*/
    static int factorial(int data)
    {
        
        int fact =1;
        while (data!=0) {
            fact = fact*data;
            data--;
        }
        return fact;
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int p = sc.nextInt();
        int r= factorial(p);
        System.out.println("The no of digits of this no is"+" "+r);
        
    }
}
