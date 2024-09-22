// matrix multiplication
import java.util.Scanner;

public class Matrix_M {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int rows = sc.nextInt();
        System.out.print("enter cols: ");
        int cols = sc.nextInt();
        int a[][] = new int[rows][cols];
        // input matrix 1
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                a[i][j] = sc.nextInt();
            }
        }
        //for output
        System.out.println();
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        //input for matrix 2
        System.out.println("enter 2nd matrix element: ");
               int b[][] = new int[rows][cols];

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                b[i][j] = sc.nextInt();
            }
        }
        // output
       for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
       // third matrix
       int c[][] = new int[rows][cols];

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                for(int k = 0; k <cols; k++){
                c[i][j]+= a[i][k] * b[k][j];
            }
            }
        }
       //output
       
        System.out.println("multiplicated matrix: ");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
