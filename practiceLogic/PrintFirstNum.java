public class PrintFirstNum {
    public static void main(String[] args) {
        int n=1234;
        while(n>=10){
            n/=10;
        }
        System.out.println(n);
        
    }
}
