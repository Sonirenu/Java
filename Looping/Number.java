package Looping;
import java.util.Scanner;
public class Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r= sc.nextInt();
        for(int i= 1; i<=r; i++){
            for(int j=i; j<=r; j++){
                System.out.print(j); //print 1 to r
            }
            for(int k=1; k<=i-1; k++){ //print 1 to i-1
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
