
public class recursion{
    int sum(int n){
            if(n==0){
                return n;
            }
            return n+sum(n-1);
        }
        
    public static void main(String[] args) {
        recursion obj = new recursion();
        System.out.println(obj.sum(10));
        
    }
}

