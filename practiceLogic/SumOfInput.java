import java.util.Scanner;
public class SumOfInput{
    public static void main(String[] args) {
        int n, num,sum=0;
      Scanner sc= new Scanner(System.in);
      n=sc.nextInt();
      System.out.println("enter the num");
      for(int i=1; i<=n; i++){
        num= sc.nextInt();
        sum=sum+num;
      }
      System.out.println("sum is:"+sum);
    }
}