package array;
import java.util.Scanner;
public class LastIn {
    static int lastIndex(int[] arr, int x){
      int ans=-1;
        for(int i=1; i<arr.length; i++){
            if(arr[i]==x){
                ans=i;
            }
        }
        return ans;
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
            System.out.println("Enter Element:x");
            int x=sc.nextInt();
            System.out.println("Find Lastt Occourance of Number: "+lastIndex(arr, x));
            
        
    }
}
