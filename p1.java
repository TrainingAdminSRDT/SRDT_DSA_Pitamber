
public class p1 {

    public static void main(String[] args) {
        int n = 4;
        daimond(n);
        secondDaimond(n);
    }

    public static void daimond(int n) {
        for (int i = 1; i <= n; i++) {

            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            System.out.println( " ");
        }

    }

    public static void secondDaimond(int n) {

        for (int i = n; i > 0; i--) {
            for (int k = 0; k < n - i; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
