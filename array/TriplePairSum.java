package array;
import java.util.Scanner;
public class TriplePairSum {
    static int tripleSum(int[] arr, int target){
        int n=arr.length;
        int ans=0;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                for(int k=j+1; k<n; k++){
                    if(arr[i]+arr[j]+arr[k]==target){
                        ans++;
                    }
                }
            }      
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter Array Size: ");//6
         int n=sc.nextInt();
         int[] arr=new int[n];

         System.out.println("Enter " + n + "element");//1 4 5 6 3 2
         for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
         }
         System.out.println(" Enter Target Sum ");//12
         int target=sc.nextInt();
         System.out.println(tripleSum(arr, target) +" Sum of element");//3
    }
}

