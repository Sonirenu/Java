public class BitwiseOperator {
    public static void main(String[] args) {
        int p=9,q=10;
        System.out.println(p | q);//11 or operator
        System.out.println(p & q);//8 and operator
        System.out.println(p ^ q);//3 xor opertor when both condition are same then result is zero.other one

        System.out.println(p << 1);//a=p b=1 ls=a*2^b//18
        System.out.println(p << 3);//72

        System.out.println(p >> 1);//a=p b=1 ls=a/2^b //4
        System.out.println(q >> 3);//1
        
    }
}
