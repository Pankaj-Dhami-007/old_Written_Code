
public class Patterns {
    static void num_1()
    {
        for(int i=1; i<=5; i++)
        {
            for(int j=1; j<=i;j++)
            {
                System.out.print(i);
            }
           System.out.println(); 
        }
    }
    static void num_2()
    {
      for(int i=1; i<=5; i++)
        {
            for(int j=1; j<=i;j++)
            {
                System.out.print(j);
            }
           System.out.println(); 
        }
  
    }
    static void num_3()
    {
        int number = 1;
        for(int i=1; i<=5; i++)
        {
            for(int j=1; j<=i;j++)
            {
                System.out.print(number);
                number++;
            }
           System.out.println(); 
        }

    }
    static void num_4()
    {
      
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                int sum = i+j;
                if(sum%2 == 0)
                {
                    System.out.print("0");
                }
                else
                {
                    System.out.print("1");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        num_1();
        num_2();
        num_3();
        num_4();
    }
    
}
