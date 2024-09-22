class Diamond {
    void set(){
        int q = 4;
        for(int i = 1; i <= q; i++){
           for(int j = 1; j<= q-i; j++){
               System.out.print(" ");
               
           }
           for(int j = 1; j <= 2 * i-1; j++){
            System.out.print("*");   
           }
           System.out.println();
        }
        for(int i = q; i >= 1; i--){
           for(int j = 1; j<= q-i; j++){
               System.out.print(" ");
               
           }
           for(int j = 1; j <= 2 * i-1; j++){
            System.out.print("*");   
           }
           System.out.println();
        }
    }
}
class Demo {
    
    void disp(){
        int n = 5;
        for(int i = 1; i <= n; i++){
           for(int j = 1; j<= n-i; j++){
               System.out.print(" ");
           }
           for(int j = 1; j<=i; j++){
            System.out.print(i + " ");   
           }
           System.out.println();
        }
    }
    void show(){
        int p = 5;
        for(int i = 1; i <= p; i++){
            for(int j = 1; j<=p-i; j++){
                System.out.print(" ");
            }
          for(int j = i; j>=1 ; j--){
              System.out.print(j);
          } 
          for(int j = 2; j<= i; j++){
             System.out.print(j); 
          }
          System.out.println();
        }
    }
}
public class Pattern_Q {
    public static void main(String args[]){
       
     Demo obj = new Demo();
     obj.disp();
     obj.show();
     Diamond d = new Diamond();
     d.set();
    }
    
}
