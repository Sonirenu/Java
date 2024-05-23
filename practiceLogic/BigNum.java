import java.util.Scanner;
public class BigNum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a,b,c,largest;
        System.out.println("Enter the first num.");
        a=sc.nextInt();
        System.out.println("Enter the second num.");
        b=sc.nextInt();
        System.out.println("Enter the third num.");
        c=sc.nextInt();
        largest=c>(a>b?a:b)?c:((a>b)?a:b);
        System.out.println("largest num. is:"+largest);
        
    }
}
