public class PairsInAnArray {

    public static void main(String[] args) {
        
        int Arr[] = {1,2,3,4};
        pairs(Arr);
    }

    public static void pairs (int Arr[]) {
     
        for (int i = 0 ; i <= Arr.length -1 ; i++) {
           int first = Arr[i];
            for(int j = 1 + i; j < Arr.length ; j++) {
                int seacond = Arr[j];

             System.out.print("(" + first + "," + seacond + ")");
            }
        }
       
    }
 }