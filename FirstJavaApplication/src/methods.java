class ABC{
    int mult(int p, int q, int r){
       int z = (p+q)*r;
       return (z);
    }
}
class methods{
    public static void main(String args[])
    {
      add obj = new add();
      obj.disp(20,10);
      obj.show(9, 9);
      ABC a = new ABC();
     // System.out.println(a.mult(8, 8, 5));
     int y = a.mult(8, 8, 5);
     System.out.println(y);
    }
}
class add {
    void disp(int x,int y)
    {
        int z = x+y;
        System.out.println("addition:"+z);
    }
    void show(int a, int b){
        int c = a*b;
        System.out.println("multiplication:"+c);
    }
}




