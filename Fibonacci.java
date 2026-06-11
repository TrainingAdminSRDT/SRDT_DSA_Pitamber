public class Fibonacci {
    public static int getFibonacci(int n) {
        // Base cases
        if (n == 0) return 0;
        if (n == 1) return 1;
        
        
        return getFibonacci(n - 1) + getFibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 6;
        System.out.println("The " + n + "th Fibonacci number is: " + getFibonacci(n));
        
    }
}