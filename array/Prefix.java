package array;
import java.util.*;
public class Prefix {
    static void printArray(int[] arr){
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static int[] makePrefixSumArray(int[] arr){
        int n=arr.length;
        for(int i=1; i<n;i++){
             arr[i]=arr[i-1]+arr[i];
        }
        return arr;
    }

    static int[] mekePrefixSumArray(int[] arr){
        int n=arr.length;
        int[] pre=new int[n];
        pre[0]=arr[0];
        for(int i=0; i<n;i++){
             pre[i]=pre[i-1]+arr[i];
        }
        return pre;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter Array Size");
         int n=sc.nextInt();
         int[] arr=new int[n];
         System.out.println("Enter "+n+" Element");
         for(int i=0; i<n;i++){
            arr[i]=sc.nextInt();
         }
         //makePrefixSumArray(arr);
         System.out.println("Input Array");
         printArray(arr);
         System.out.println();
         int[] ans=makePrefixSumArray(arr);
        // mekePrefixSumArray(arr);
         printArray(ans);
    }
}
