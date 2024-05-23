package array;
import java.util.Scanner;
public class PairSum {
    static int pairSum(int[] arr, int target){
        int n=arr.length;
        int ans=0;
        for(int i=0; i<n; i++){
            for(int j= i+1; j<n; j++){
                if(arr[i]+arr[j]==target){
                    ans++;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter Array Size: ");//5
         int n=sc.nextInt();
         int[] arr=new int[n];

         System.out.println("Enter " + n + "element");//46532
         for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
         }
         System.out.println(" Enter Target Sum ");//7
         int target=sc.nextInt();
         System.out.println(pairSum(arr, target) +" Sum of element");
    }
}
