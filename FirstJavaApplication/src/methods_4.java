/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author panka
 */
class Invrt180halfPyramid{
    void disp(){
        for(int i=1; i<=4; i++){
            for(int j=1; j<=4-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
public class methods_4 {
    public static void Pyramid()
    {
     for(int i =1; i<=5; i++)
        {
            for(int s=5; s>=i; s--)
            {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++)
            {
                System.out.print("* ");
            }
                       System.out.println();
        }
     System.out.println();
   
    }
    public static void Pyramidd()
    {
        for(int i =1; i<=5; i++)
        {
            for(int s=5; s>=i-1; s--)
            {
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++)
            {
                System.out.print("*");
            }
                       System.out.println();
        }
    }
    public static void main(String args[]){
       Invrt180halfPyramid obj = new Invrt180halfPyramid();
       obj.disp();
       Pyramid();
       Pyramidd();
    }
    
}
