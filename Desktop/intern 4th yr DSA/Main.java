public class Main {
    public static void main(String[] args) {
        String[] arr = {"ravi", "priya", "kumar"};

        for (String s : arr) {
            if (!s.equals("priya")){
                System.out.print(s + " ");
            }
        }
    }
}