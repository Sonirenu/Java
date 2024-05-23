package array;
import java.util.*;
public class Printprefix {
    static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
        System.out.print(arr[i]+" ");
        }
    }

    static int[] makePrefixSumArray(int[] arr){
        int n=arr.length;
        for(int i=0; i<n;i++){
             arr[i]=arr[i-1]+arr[i];
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("array size");
        int n=sc.nextInt();
        int[] arr=new int[n+1];
        System.out.println("Enter "+n+" Element");
        for(int i=1; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int[] prefSum= makePrefixSumArray(arr);
        //printArray(prefSum);

        System.out.print("Enter num. of queries");
        int q=sc.nextInt();
        while(q-->0){
            System.out.println("Enter Array");
            int l=sc.nextInt();
            int r=sc.nextInt();

            int ans=prefSum[r] - prefSum[l-1];

            System.out.println("sum "+ans);
        }
        
    }
}
