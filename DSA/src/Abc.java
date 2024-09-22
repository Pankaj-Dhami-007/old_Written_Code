/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author panka
 */
public class Abc {
        public static void main(String[] args) {
        int n=6;
       int ans= fibo(n);
            System.out.println(ans);
       for (int i = 0; i < n; i++) {
                System.out.println(fibo(i));
            }

    }
        static int fibo(int n){
            if(n<2){
                return n;
            }
            return fibo(n-1)+ fibo(n-2);
                    }
    
}
