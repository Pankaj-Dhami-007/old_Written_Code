


public class Exception { 
    public static int devide(int a, int b) throws ArithmeticException
    {
        int result = a/b;
        return result;
    }
    public static void main(String args[])
    {
        try{
        int c = devide(6, 0);
        System.out.println(c);
        }
        catch(ArithmeticException e)
        {
           System.out.println("not allowed"); 
        }
    }
}
