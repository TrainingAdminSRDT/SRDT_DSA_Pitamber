import java.util.Scanner;

public class NaturalSumUserInput {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer (n): ");
        int n = scanner.nextInt();

        // Validate that the input is a positive natural number
        if (n < 0) {
            System.out.println("Please enter a non-negative number.");
        } else {
            int result = recurSum(n);
            System.out.println("The sum of the first " + n + " natural numbers is: " + result);
        }

        // Close the scanner to prevent memory leaks
        scanner.close();
    }

    // Recursive method to calculate sum
    public static int recurSum(int n) {
        if (n <= 0) {
            return 0;
        }
        return n + recurSum(n - 1);
    }
}
