

public class Array {
    public static int[] runningSum(int num[])
    {
        for (int i = 1; i < num.length; i++) {
           num[i] = num[i-1]+num[i]; 
        }
         return num;
    }
    public static void main(String args[])
    {
        int num[] = {1,2,3,4,5};
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]+" ");
        }
        System.out.println();
        int r[] = runningSum(num);
        for (int i = 0; i < num.length; i++) {
            System.out.print(r[i]+" ");
        }
    }
}
