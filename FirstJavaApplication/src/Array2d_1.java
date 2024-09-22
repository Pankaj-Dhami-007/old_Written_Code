import java.util.Scanner;
//take a matrix as input from the user

public class Array2d_1 {
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      
      System.out.print("Enter row:");
      int rows = sc.nextInt();
      System.out.print("Enter column:");
      int cols = sc.nextInt();
      int num[][] = new int[rows][cols];
      // input
      // rows
      for(int i = 0; i < rows; i++){
          //columns
          for(int j = 0; j < cols; j++){
              System.out.print("Enter value of " + i +" " + j + ":");
              num[i][j] = sc.nextInt();        
          }
      }
      // output
      for(int i = 0; i < rows; i++){
          for(int j = 0; j < cols; j++){
           System.out.print(num[i][j] + " ");
          }
          System.out.println();
      }
    }
}