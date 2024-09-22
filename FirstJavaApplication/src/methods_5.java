/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author panka
 */
class Full_Pyramid{
    void disp(){
      for(int i=1; i<=4; i++){
          for(int j=1; j<=7; j++){
              if(j>=5-i && j<=3+i){
                  System.out.print("*");
              }else 
              {
                  System.out.print(" ");
              }
          }
          System.out.println();
      }  
    }
}
public class methods_5 {
    public static void main(String args[]){
       Full_Pyramid obj = new Full_Pyramid();
       obj.disp();
    }
    
}
