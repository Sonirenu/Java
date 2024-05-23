public class LogicalOperator {
    public static void main(String[] args) {
        int p=20,q=10,r=5;
        //&& Operator

        System.out.println((p<q)&&(p<r));//false
        System.out.println((p<q)&&(p>r));//false

        //|| Operator

        System.out.println((r<q)&&(p<q));//false
        System.out.println((p>q)&&(p>r));//true
        System.out.println((p<q)&&(q<r));//false

        //! Operator

        System.out.println(!(p==q));//true
        System.out.println(!(p<q));//true
        System.out.println(!(p>q));//false
        
    }
}
