
public class Constructor {
    public static void main(String args[])
    {
        test t1 = new test();
        test t2 = new test(10, 15);
    }
}
class test
{
    int a;
    int x, y, z;
    test()
    {
        a=10;
        System.out.println("A: "+a);
    }
    test(int a, int b)
    {
        x=a; y=b;
        z=x+y;
      System.out.println("x+y: "+z);  
    }
}
