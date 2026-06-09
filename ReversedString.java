

import java.util.Scanner;

public class ReversedString { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string to reverse: ");
        String input = scanner.nextLine(); 
        
        StringBuilder reversed = new StringBuilder();
         
        backtrackReverse(input, 0, reversed);
        
        System.out.println("Reversed string: " + reversed.toString());
        
        scanner.close(); 
    }

    private static void backtrackReverse(String str, int index, StringBuilder result) {
        
        if (index == str.length()) {
            return;
        }

        
        backtrackReverse(str, index + 1, result);
        
        result.append(str.charAt(index));
    }
}