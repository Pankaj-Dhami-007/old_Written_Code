import java.util.Scanner;

public class Array2d {
    public static void main(String args[]){
       // int num[][] = {{11,22,33,44}, {5,10,15,20}, {10,20,30,40}};
       Scanner sc = new Scanner(System.in);
       int num [][] = new int[3][4];
        System.out.println("enter values: ");
        for(int i = 0; i<3; i++){
            for(int j = 0; j<4; j++){
                num[i][j] = sc.nextInt();
            }
        }
        System.out.println("you entered: ");
        for(int i=0; i<3; i++){
            for(int j=0; j<4; j++){
                System.out.print(num[i][j]  + " ");
            }
            System.out.println();
        }
    }
}
