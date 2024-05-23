import java.util.*;
public class TwoDArray {
    public static add(int[][] a, int r1, int c1, int[][] b,  int r2, int c2){
        if(r1!=r2 || c1!=c2){
            System.out.println("Sum is Not Possible:");
            return;
        }
        int[][] sum=new int[r1][c1];
        for(int i=0; i<r1; i++){
            for(int j=0; j<c1; j++){
          sum[i][j]=a[i][j]+b[i][j];
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Rows ");
        int r=sc.nextInt();
        System.out.println("Enter Number of Column ");
        int c=sc.nextInt();
        int[][] arr=new int[r][c];
        System.out.println("Enter "+r*c+" Element ");
        for(int i=0; i<r1;i++){
            for(int j=0; j<c1; j++){
                arr[i][j]=sc.nextInt();m
            }
        }
    }
}
