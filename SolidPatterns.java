public class SolidPatterns {
    public static void main(String[] args) {
        int n = 4;
        int m = 5;
        //OUTER LOOPS:
        for(int i=1; i<=n; i++){
            //INNER LOOPS:
            for(int j=1; j<=m; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}