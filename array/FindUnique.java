package array;
import java.util.Scanner;
public class FindUnique {
    static int findunique(int[] arr){
        int n= arr.length;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i]==arr[j]){
                    arr[i]=-1;
                    arr[j]=-1;
                }
            }
        }
    
        int ans=-1;
        for(int i=0; i<n; i++){
            if(arr[i]>0){
                ans=arr[i];
            }
        }
    
        return ans;
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
         System.out.println("Enter Array Size: ");//5
         int n=in.nextInt();
         int[] arr=new int[n];

         System.out.println("Enter " + n + "element");//46532
         for(int i=0; i<n; i++){
            arr[i]=in.nextInt();
         }
         System.out.println("Unique Element " + findunique(arr));
         
}
}
