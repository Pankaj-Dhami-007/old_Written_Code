import java.util.Scanner;
// hollow rectangle
public class methods1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = sc.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                if (i == 1 || i == rows || j == 1 || j == cols) {
                    // Print a star for the boundary of the rectangle
                    System.out.print("*");
                } else {
                    // Print a space for the inside of the rectangle
                    System.out.print(" ");
                }
            }
            // Move to the next row
            System.out.println();
        }
    }
}