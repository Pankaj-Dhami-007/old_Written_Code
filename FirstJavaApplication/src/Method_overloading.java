
public class Method_overloading {
    public static void main(String args[])
    {
     Test t = new Test();
     t.disp(10, 20);
     t.disp(5, 12.0f);
    }
}
class Test {
    void disp(int a, int b)  //instance method
    {
        int x=a, y= b;
        int z = x+y;
        System.out.println("Addition="+z);
    }
    void disp(int a, float b)  // instance method
    {
        int x = a;
        float y = b;
        float z = x*y;
       System.out.println("multiplication="+z); 
    }
}
