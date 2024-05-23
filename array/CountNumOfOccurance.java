package array;
import java.util.Scanner;
public class CountNumOfOccurance {
    static int countOccurance(int[] arr, int x){
       int count=0;
        for(int i=0; i<arr.length;i++)
        {
            if(arr[i]==x){
               count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Element");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter "+ n+" element");
        for(int i=0; i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        // for(int i=0; i<arr.length;i++){
        //   System.out.println(arr[i]);
        // }
        System.out.println("Enter Element:x");
        int x=sc.nextInt();
        System.out.println("Count Num Of Occurance" + countOccurance(arr, x));

    }
}
