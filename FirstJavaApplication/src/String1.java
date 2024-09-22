
public class String1 {
    public static void main(String args[])
    {
     String name;
    name = new String("Dhami");
    String name1 = "Dhami";
    int n = name.length();
    String f[] = {" Pankaj","Singh","Dhami"};
    System.out.println("name with new:"+name);
    System.out.println("name without new:"+name);
    System.out.println("String length:"+n);
    System.out.println(f[0]);
    for(int i =0; i<3; i++)
    {
       System.out.print(f[i]); 
    }
    }
}
