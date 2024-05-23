//to swap the first and last digit
public class FirstLast {
    public static void main(String[] args) {
        int n=1234;
        int f=0,l=0;
        l= Math.abs(n%10);
        //System.out.println(l);
        while(n!=0){
            f=Math.abs(n%10);
            n/=10;
        }
        System.out.println(f+" 2 3 " + l);
        int t=f;
        f=l;
        System.out.println(f+" 2 3 " + t);
    }
}
