class patterns{
    void Invert_halfpyramid()
    {
        for(int i =5; i<=1; i--)
         {
           for(int j =1; j<=i; j++)
           {
             System.out.print("*");  
           }
           System.out.println();
         }

}
}
public class Pattern_1 {
    static void Solid_rect()
    {
      for(int i=1; i<=4; i++)
        {
            for(int j =1; j<=5; j++)
            {
               System.out.print("*"); 
            }
           System.out.println(); 
        }  
    }
    static void Hollow_rect()
    {
      for(int i =1; i<=4;i++)
      {
          for(int j =1; j<=6; j++)//limit *
          {
             if(i == 1 || j == 1 || i == 4 || j == 6)
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
    static void Half_pyramid()
      {
         for(int i =1; i<=5; i++)
         {
           for(int j =1; j<=i; j++)
           {
             System.out.print("*");  
           }
           System.out.println();
         }
      }
    static void rHalf_pyramid() //180 deg
    {
       for(int i =1; i<=4;i++)
       {
          for(int j =1; j<=4-i; j++)//for space
          {
            System.out.print(" ");  
          }
          for(int k =1; k<=i; k++)
          {
              System.out.print("*");
          }
          System.out.println();
        }
    }
    
        public static void main(String args[])
    {
       

       Solid_rect();
       Hollow_rect();
       Half_pyramid();
       rHalf_pyramid();
     }
}
