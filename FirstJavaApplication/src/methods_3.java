/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author panka
 */
class InvtPyramid{
    void disp(){
        for(int i=4; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("  *");
            }
            System.out.println();
        }
    }
}
public class methods_3 {
    public static void main(String args[]){
        InvtPyramid obj = new InvtPyramid();
        obj.disp();
    }
    
}
