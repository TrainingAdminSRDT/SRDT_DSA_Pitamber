
public class p6 {

    public static void main(String[] args) {
        triangle(5);
    }

    public static void triangle(int row) {
        int sum = 0;
        for (int i = 1; i <= row; i++) {

            for (int j = 1; j <= i; j++) {
                sum = sum + 1;
                System.out.print(" " + sum);
               
            }
            System.out.println(" ");
        }
    }
}
