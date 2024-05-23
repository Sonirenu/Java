package array;
import java.util.Scanner;
public class LastRepeatNum {
    static int lastRepeatNum(int[] arr){
        int n=arr.length;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[j]==arr[i])
                return arr[i+1];
            }
        }
        return -1;
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
         System.out.println("Last Repeating Number :"+lastRepeatNum(arr));//-1
}
}

