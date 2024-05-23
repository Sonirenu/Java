package Looping;
import java.util.Scanner;

public class While {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n = sc.nextInt();
    int num = sc.nextInt();
    while(num<=n){
    System.out.println(num);
    num++;
    }  
}
}
