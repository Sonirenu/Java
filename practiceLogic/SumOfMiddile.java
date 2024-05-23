public class SumOfMiddile {
    static int getSum(int n){
        int sum=0;
        sum=sum+(n/100)%10+(n%100)/10;
        return sum;
    }
    public static void main(String[] args) {
        int N=1234;
        System.out.println(getSum(N));
    }
}
