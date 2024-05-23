import java.util.Scanner;
public class TernaryOperator {
    public static void main(String[] args){

     Scanner sc= new Scanner(System.in);
     System.out.println("Lucky number is");
      int num= sc.nextInt();

   //System.out.println("enter input:"+num);
   
      String ans;
      ans =(num % 2 == 0)?"even" : "odd";
      System.out.println(ans);
    }
}
