
public class MyClass {
    
    public static void A()
    {
      for(int i =1; i<=5; i++)
      {
          for(int j=1; j<=5; j++)
          {
              if(i == 1 || i == 3 || j == 1 || j== 5)
              {
                 System.out.print("*");
              }
              else
              {
               System.out.print(" ");   
              }
          }
          System.out.println();
      }
    }
    
    public static void B()
    {
     for(int i =1; i<=5; i++)
      {
          for(int j=1; j<=5; j++)
          {
              if(i == 1 || i == 3 || j == 1 || j== 5 || i == 5)
              {
                 System.out.print("*");
              }
              else
              {
               System.out.print(" ");   
              }
          }
          System.out.println();
      }
   
    }
    
    static void C()
    {
     for(int i =1; i<=5; i++)
      {
          for(int j=1; j<=5; j++)
          {
              if(i == 1 || i == 5 || j == 1)
              {
                 System.out.print("*");
              }
              else
              {
               System.out.print(" ");   
              }
          }
          System.out.println();
      }   
    }
    public static void D()
    {
      for(int i =1; i<=5; i++)
      {
          for(int j=1; j<=5; j++)
          {
              if(j == 1 || (i == 1 && j <=4) || ((i >=2 && i<=4) && j == 5) || i == 5 && j<=4)
              {
                 System.out.print("*");
              }
              else
              {
               System.out.print(" ");   
              }
          }
          System.out.println();
      }      
    }
    
    public static void G()
    {
     for(int i =1; i<=5; i++)
      {
          for(int j=1; j<=5; j++)
          {
              if(i == 1 || j == 1 || i == 5 || (i == 3 && j >=3) || (j == 5 && i >=3))
              {
                 System.out.print("*");
              }
              else
              {
               System.out.print(" ");   
              }
          }
          System.out.println();
      }      
    }
    
    public static void K()
    {
     for(int i =1; i<=7; i++)
      {
          for(int j=1; j<=4; j++)
          {
              if(j == 1 || i+j == 5 || (i>4 && i-j == 3))
              {
                 System.out.print("*");
              }
              else
              {
               System.out.print(" ");   
              }
          }
          System.out.println();
      }      
    }
    public static void M()
    {
     for(int i =1; i<=5; i++)
      {
          for(int j=1; j<=5; j++)
          {
              if(j == 1 || j == 5 || (i<=3 && i+j == 6) || (i == j && i<=3))
              {
                 System.out.print("*");
              }
              else
              {
               System.out.print(" ");   
              }
          }
          System.out.println();
      }      
    }
    
    public static void O()
    {
     for(int i =1; i<=5; i++)
      {
          for(int j=1; j<=5; j++)
          {
              if((i == 1 && j >=2 && j<=4) || ( i== 5 && j>=2 && j<=4) || (j==1 && i>=2 && i<=4) || (j==5 && i>=2 && i<=4))
              {
                 System.out.print("*");
              }
              else
              {
               System.out.print(" ");   
              }
          }
          System.out.println();
      }      
    }
public static void Q()
    {
     for(int i =1; i<=6; i++)
      {
          for(int j=1; j<=6; j++)
          {
              if((i == 1 && j<=5) || (j == 1 && i<=5) || (j == 5 && i<=5) || (i ==5 && j<=5) || (i>=3 && i == j))              {
                 System.out.print("*");
              }
              else
              {
               System.out.print(" ");   
              }
          }
          System.out.println();
      }      
    }

    public static void main(String args[])
    {
    A();
    B();
    C();
    D();
    G();
    K();
    M();
    O();
    Q();    
    }
}
     
        