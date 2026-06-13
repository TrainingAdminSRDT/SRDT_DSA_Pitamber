public class p3 {

    public static void main(String[] args) {
        rombus(5,9);
    }

    public static void rombus (int row  , int col ) {
           
        for(int i= 1 ;i <=5 ; i++) {
                
            for(int a = 0; a <= row - i; a++) {

                System.out.print(" ");

               
            }
              for (int b = 1 ; b <= 5 ; b++) {

                    System.out.print("*");

                 }
            System.out.println();
        }
    }
}