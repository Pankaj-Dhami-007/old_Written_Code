/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author panka
 */
public class Dhami {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        
        for(int i=1; i<arr.length; i++){
            arr[i]=arr[i-1]+arr[i];
        }
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
                    
        }
                
    }
    
    
}
