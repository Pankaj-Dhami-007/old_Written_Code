
public class Name_Print {
    public static void main(String args[])
    {
       for(int i =1; i<=6; i++)
      {
          for(int j=1; j<=20; j++)
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
    
}
