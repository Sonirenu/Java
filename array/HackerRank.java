package array;
// 2
// 0 2 10    output 2 6 14 30 62 126 254 510 1022 2046
// 5 3 5            8 14 26 50 98
 
import java.util.*;
//import java.io.*;

public class HackerRank{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for(int j=0;j<n;j++){
                a= a + (int)Math.pow(2, j) * b;
                System.out.print( a + " ");
            }
           System.out.print("\n");   
        }
        
        in.close();
    }
}
