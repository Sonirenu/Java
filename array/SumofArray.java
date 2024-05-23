package array;
import java.util.Scanner;
public class SumofArray {
    void sumArray(){
        int[] arr={1,2,3,4,5,6,7,8,9};
        int sum=0;
        for(int i=0; i<arr.length; i++){
            sum= sum+arr[i];
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        System.out.println("Enter number of Rows and columns ");
        int r1=sc.nextInt();
        int c1=sc.nextInt();
        int[][]
        SumofArray obj= new SumofArray();
        obj.sumArray();
        
    }
}
