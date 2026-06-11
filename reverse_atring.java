public class reverse_atring {
    public static String reverse(String str) {
        
        if (str.isEmpty() || str.length() <= 1) {
            return str;
        }
        
        return reverse(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        String text = "hello";
        System.out.println("Reversed: " + reverse(text)); 
}