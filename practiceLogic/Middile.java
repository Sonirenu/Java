public class Middile {
    static int middileDigit(int n, int m){
        // find total num of digit
        int digits= (int)Math.log10(n)+1;
        //find middile digit
        n =(int)(n/Math.pow(10,digits/2))%10;
        m =(int)(m/Math.pow(10,digits/3))%10;
        
        //return middile digit
        //return n;
        return m;
    }
        public static void main(String[] args) {
            int N1=1234;
            int N2=1234;
            System.out.println(middileDigit(N1,N2));
        }
    }

