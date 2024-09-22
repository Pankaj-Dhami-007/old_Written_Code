public class Htriangle {
    public static void disp(int n, int m){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if(i+j == 5 || j-i == 3 || i == 4 ){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void display(int n, int m){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if(i+j == 5 || j-i == 3 || i == 4 && j % 2 != 0 ){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 4;
        int m = 7;
        disp(n, m);
        System.out.println();
        display(n, m);
    }
}
