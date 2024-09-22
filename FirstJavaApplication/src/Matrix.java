import java.util.Scanner;
//search for a number x and print the indices at which it occurs
public class Matrix {
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
      int x = sc.nextInt();
      
for(int i = 0; i < rows; i++){
    for(int j=0; j<cols; j++){
        if(num[i][j] == x){
            System.out.println("x found at location(" + i + "," + j + ")");
        }
    }
    
}
    }
}


