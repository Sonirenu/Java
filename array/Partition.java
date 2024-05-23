package array;
import java.util.*;
public class Partition {
    static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

    }
    static int findArraySum(int[] arr){
        int totalsum=0;
        for(int i=0; i<arr.length; i++){
            totalsum+=arr[i];
        }
        return totalsum;
    }
    static boolean equalSumPartition(int[] arr){
        int totalsum=findArraySum(arr);
        int prefixSum=0;
        for(int i=0; i<arr.length;i++){
            prefixSum+=arr[i];
            int suffixSum=totalsum - prefixSum;
            if(suffixSum==prefixSum){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Array Size");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter "+n+" Element");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();

        }
        System.out.println("Equal Partiton possible: " +equalSumPartition(arr));
    }
    
}
