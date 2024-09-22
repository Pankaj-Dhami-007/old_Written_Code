class ABC {
    void disp(){
        int n = 5;
        int num = 1;
        for(int i = 1; i<=n; i++){
         for(int j = 1; j<=i; j++){
             System.out.print(" "+num);
             num++;
         }
         System.out.println();
        }
    }
    void show(){
        for(int i = 1; i<=5; i++){
            for(int j = 1; j<=i; j++){
                int sum = i+j;
                if(sum % 2 == 0){
                System.out.print(1);
            }else
                {
                    System.out.print(0);
                }
            }
            System.out.println();
    }
}
}
public class Patterns {
    public static void main(String args[]){
     ABC a = new ABC();
     a.disp();
     a.show();
    }
}
