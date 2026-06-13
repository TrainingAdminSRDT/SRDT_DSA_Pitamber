import java.util.Scanner;
public class p1 {
  
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("enter the target");
         int a = sc.nextInt();
         int[] arr = {1,98,95,49,3,7,51,31,4,5};
         System.out.println(search(arr, a));
      
    }

    static int search(int[] arr, int target) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == target) {
                System.out.println("number is at " + i);
                return i;
            }
        }
        System.out.println("NUMBER NOT FOUND");
        return -1;
    }
}