public class LeftHalfPatterns{
    public static void main(String[] args) {
        int n = 5;
        //Outer space:
        for(int i=1; i<=n; i++){
            //Inner loop for space:
            for(int j = 1; j<=n-i; j++){
                System.out.print(" ");
            }// EK BAAR LOOP SE BAHAR AA JAO TOH J KI MEMORY ERASE HO JATI H THEREFORE USKO PHIRSE INTIALIZE KR SAKTE H .
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}