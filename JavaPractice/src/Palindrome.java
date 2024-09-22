

public class Palindrome {
    public static boolean isPalindrome(int x){
        if(x<0) return false;
        double reversed = 0;
        double temp = x;
        while (temp!=0) {
            int dig = (int) (temp %10);
            reversed = reversed * 10 + dig;
            temp = temp/10;
        }
        return (reversed == x);
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        
    }
}
