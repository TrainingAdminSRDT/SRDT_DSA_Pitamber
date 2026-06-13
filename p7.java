public class p7 {

    public static void main(String[] args) {
        tri(6);
    }

    public static void tri (int row ) {
        for (int i = 1 ; i <= row ; i++) {

            for (int j = 1 ; j <= row - i ; j++) {
                 System.out.print(j);
            }
            System.out.println("");
        }
    }

}