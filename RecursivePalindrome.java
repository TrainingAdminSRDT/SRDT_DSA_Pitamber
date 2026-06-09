public class Palindrome {

    static boolean isPalindrome(String s, int i, int j) {

        if (i >= j) return true;

        if (s.charAt(i) != s.charAt(j)) return false;

        return isPalindrome(s, i + 1, j - 1);
    }

    public static void main(String[] args) {
        String str = "madam";

        if (isPalindrome(str, 0, str.length() - 1))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}