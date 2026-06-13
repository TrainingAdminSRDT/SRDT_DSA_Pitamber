public class p2 {
    public static void main(String[] args) {
        box(4, 5);
    }

    public static void box(int rows, int cols) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                if (i == 1 || i == 4 || j == 1 || j == 5 ) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println(" ");
        }
    }
}