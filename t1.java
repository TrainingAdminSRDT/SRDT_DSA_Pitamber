
import java.util.*;

	

public class t1 {

 // Recursively sum of an array 
   
// public static int sumArray(int arr[],int n){
//             if (n == 0) {
//             return 0;
//         }
// 		  return sumArray(arr, n - 1) + arr[n - 1];
// 	}
// Recursive linear search 

// public static int LinearSearch(int arr[],int key,int i){
// 	if(i==arr.length){
// 		return -1;
// 	}
// 	if(arr[i]==key){
// 		return i;
// 	}
// 	return LinearSearch(arr,key,i+1);
// }


//Reverse a string using recursion 

public static String revString(String str,int n){
	if(n==0){
		return "";
	}
	   return str.charAt(n - 1) + revString(str, n - 1);

	
} 


	 public static void main(String[] args) {
	
		String str = "Coding";
		String rev = revString(str,str.length());
		System.out.println("Reversed String  "+rev);
		
// int arr[] = {10,45,23,64,12};
// int key = 64;
// int i = LinearSearch(arr,key,0);
// if(i==-1){
// 	System.out.println("Element not found");
// }else{
// 	System.out.println("Element found at index:"+i);
// }
		 

		   
		// int arr[] = {1,2,3,4,5};
		// int sum = sumArray(arr,arr.length);
		// 	System.out.println(sum);

    
	// 	String[] str = new String[3];
	// 	str[0] = "Apoorva";
	// 	str[1] = "Apoo";
	// 	str[2] = "Apurva";
		
	// 	for(int i = 0;i<3; i++){
	// 	System.out.println(str[i]);
	// }
	// str[str.length-1] = "";
	// 	for(int i = 0;i<3; i++){
	// 	System.out.println(str[i]);
	// }

    
        // int[] arr = {1, 2, 3, 4, 5};
        // int len = arr.length; 
        // for (int i = 0; i < len / 2; i++) {
        //     arr[i] = arr[i] ^ arr[len - 1 - i];
        //     arr[len - 1 - i] = arr[i] ^ arr[len - 1 - i];
        //     arr[i] = arr[i] ^ arr[len - 1 - i];
        // }

        // for (int i = 0; i < len; i++) {
        //     System.out.print(arr[i] + " ");
        // }

      


}
}


