import java.util.Scanner;

public class MainClass {
    public static int calculateSum(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
 }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int result = calculateSum (num1, num2);
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + result);

    }

   
}