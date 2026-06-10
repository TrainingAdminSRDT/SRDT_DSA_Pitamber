package SRDT_DSA_Pitamber;

public class palindrone {
    class Main {
    public static void main(String[] args) {
        int num=121;
        int temp=num;
        rev=0;
        while(num>0){
            int digit= num%10;
            rev=rev*10+digit;
            num=num/10;
        }
        if( temp==rev){
            sout(true);
            }else{
                sout("false");
            }
        
        
    }
}
}
