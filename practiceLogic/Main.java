
class Algebra{
    int a;
    int b;
    Algebra(int x, int y){
        System.out.println("constructor of algebra class called");
        a=x;
        b=y;
    }
    int add(){
        int ans= a+b;
        return ans;
    }
    int sub(){
        return a-b;
    }
    int mul(){
        return a*b;
    }
}
public class Main {
    public static void main(String[] args) {
        Algebra A =new Algebra(7,5);
        int ans= A.add();
        System.out.println(ans);
        System.out.println(A.sub());
        System.out.println(A.mul());
        Algebra B =new Algebra(7,5);
        System.out.println(ans);
        System.out.println(B.sub());
        System.out.println(B.mul());
        System.out.println(B.add());
    }
}
