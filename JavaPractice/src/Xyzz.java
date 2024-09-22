
public class Xyzz {
    public static void demo1(int n, int m){
        for (int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");   
            }
            for(int k = 1; k <= 2*(n-i); k++){
               System.out.print(" "); 
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
}
           public static void demo(int n, int m){
               for(int i = 1; i<=n; i++){
                   for(int j= 1; j<= i; j++){
                       System.out.print("*");
                   }
                   for(int k =1; k<=n-i; k++){
                       System.out.print(" ");
                   }
                   for (int j = 1; j <=i; j++) {
                       System.out.print("*");
                   }
                   System.out.println();
               }
              
           }
          public static void main(String[] args) {
      int n = 5;
      int m = 10;
      demo(n, m);
      demo1(n, m);
    }
  
}
