public class p4 {
 
    public static void main(String[] args) {
        hollow_rhombus(5);
    }

    public static void hollow_rhombus(int n) {
        for (int i = 1; i <= n; i++) {

            // Leading spaces for the slant 
            for (int a = 0; a < n - i; a++) {
                System.out.print("  ");
            }

            // Stars or hollow spaces
            for (int b = 1; b <= n; b++) {
                if (i == 1 || i == n || b == 1 || b == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }
}