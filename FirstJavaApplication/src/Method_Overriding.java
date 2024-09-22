
public class Method_Overriding {
    public static void main(String args[])
    {
    Super_Class s = new Super_Class();
    Sub_Class1 sc = new Sub_Class1();
    Sub_Class2 sub = new Sub_Class2();
    s.cal();
    sc.cal();
    sub.cal();
    }
}
class Super_Class{
    int a=100;
    void cal()
    {
        System.out.println("Super class\n");
    }
}
class Sub_Class1 extends Super_Class{
    int b=200;    
    void cal()      ////method overriding
    {
        int sum = a+b;
        System.out.println("Sub class1\n");
        System.out.println("ADDITION="+sum);   
    }
}
class Sub_Class2 extends Super_Class{
    int c= 20;
    void cal()        ////method overriding
    {
        int mult=a*c;
     System.out.println("Sub class2\n");
     System.out.println("Multiplication ="+mult);   
    }
}

