package array;
import java.util.Scanner;
public class Sort {
    static boolean isSorted(int[] arr){
        boolean check=true;
        for(int i=1; i<=arr.length; i++){
            if(arr[i]<arr[i-1]){
                check=false;
                break;
            }
            
        }
        return check;
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
            System.out.println("it is a sorted array: "+isSorted(arr));
        
    }
}
