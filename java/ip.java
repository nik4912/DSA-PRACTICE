import java.util.Scanner;

public class ip {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        // Adding the numbers
        int sum = num1 + num2;

        // Printing the result
        System.out.println("Sum: " + sum);
    }
}
