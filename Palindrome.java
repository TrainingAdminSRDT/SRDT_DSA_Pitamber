import java.util.Scanner;

public class Palindrome {

    static boolean isPalindrome(String s, int i, int j) {

        if (i >= j) return true;

        if (s.charAt(i) != s.charAt(j)) return false;

        return isPalindrome(s, i + 1, j - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Prompt the user for input
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        // 2. Check if the entered string is a palindrome
        // Note: You might want to use str.toLowerCase() if you want it to be case-insensitive (e.g., "Madam" -> Palindrome)
        if (isPalindrome(str, 0, str.length() - 1))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
            
        // Close the scanner
        scanner.close();
    }
}