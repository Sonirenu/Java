/* Taking input using Scanner class */

import java.util.Scanner;

public class TakingInput{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your lucky no. is:");
        int num_1=sc.nextInt();
    System.out.println("Lucky number is" +num_1);
    System.out.println("enter your lucky no. is:");
        int num_8=sc.nextInt();
    System.out.println("Lucky number is" +num_8);
    int sum=num_1+num_8;
    System.out.println("sum:"+sum);
    System.out.println("enter your lucky no. float is:");
         float num_2=sc.nextFloat();
         System.out.println("Lucky number is" +num_2);
         System.out.println("enter your lucky no.  short is:");
         short num_3=sc.nextShort();
         System.out.println("Lucky number is" +num_3);
         System.out.println("enter your lucky no. long is:");
         long num_4=sc.nextLong();
         System.out.println("Lucky number is" +num_4);
         System.out.println("enter your lucky no. double is:");
         double num_5=sc.nextDouble();
         System.out.println("Lucky number is" +num_5);
         System.out.println("enter your lucky no. boolean is:");
         boolean num_6=sc.nextBoolean();
         System.out.println("Lucky number is" +num_6);

//read Character using Scannner class

         System.out.println("enter your char is:");
         char ch=sc.next().charAt(2);
         System.out.println("Character is:"+ch);

    }
   
}