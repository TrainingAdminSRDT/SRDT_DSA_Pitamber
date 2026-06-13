public class p5 {
    public static void main(String[] args) {
      trizeroone(5);
    }

    public static void trizeroone(int row) {
      
        for(int a = 1 ; a <= row ; a++){

            for (int i = 1 ; i <= a ; i++) {

             int sum = i +a ;
             if(sum % 2 == 0) {
                System.out.print("1");
             }else {
                System.out.print("0");
             }
            }
            System.out.println("");
        }

    }
}