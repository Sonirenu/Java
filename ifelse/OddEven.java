package ifelse;


import java.util.Scanner;

public class OddEven {
   public static void main(String[] args){
   Scanner sc= new Scanner(System.in);
   System.out.println("Lucky number is");
   int num= sc.nextInt();
   System.out.println("enter input:"+num);

   if(num%2==0)
   {
    System.out.println("even");
   }
   else{
   System.out.println("Odd");
   }
   } 
}
