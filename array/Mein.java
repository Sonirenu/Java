package array;
import java.util.Scanner;
public class Mein {
//   static void fR(int[] arr){
//    int n=arr.length;
//    int i, j;
//    for(i=0; i<n; i++){
//      for(j=i+1; j<n; j++){
//           if(arr[j]==arr[i]){
//              System.out.println(arr[i]);
//           }
     
//      }
//    }
// }
//    public static void main(String[] args){
//      Scanner sc= new Scanner(System.in);
//      System.out.println("Enter Array of size: ");
//      int n=sc.nextInt();
//      int[] arr=new int[n];
//      System.out.println("enter "+n+" element");
//      for(int i= 0; i<arr.length; i++){
//           arr[i]=sc.nextInt();
//      }
//      System.out.println("enter element x");
//      int x= sc.nextInt();
//      System.out.println("First Repeat Number "+ fR(arr));
//    }



     public static void main(String[] args){
          Scanner sc= new Scanner(System.in);
          for(int i=1; i<=3; i++){
          String s=sc.next();
          int x= sc.nextInt();
         System.out.print( s + " " + x );
         //System.out.print(s);
        // System.out.print();
        // System.out.print("         "+x);
        // System.out.println();
         
          }
         // System.out.println();
     }
     // input: java    100
     //        cpp   65
     //        python  100

     // output: java       100
     //         cpp         65
     //         python     100


     // static int con(int[] arr, int x){
     //      int count=0;
     //      int i;
     //      for(i=0;i<arr.length; i++){
     //           if(arr[i]==x){
     //           count++;
     //           }
     //      }return count;
     // }
     // public static void main(String[] args){
     //   Scanner sc=new Scanner(System.in);
     //   System.out.println("Enter size of Array");
     //   int n=sc.nextInt();
     //   int[] arr=new int[n];
     //   System.out.println(" Enter " + n + " Element ");
     //   for(int i=0; i<arr.length; i++){
     //       arr[i]= sc.nextInt();
     //   }
     //   System.out.println("enter element of x");
     //   int x=sc.nextInt();
     //   System.out.println("count of occurance number" + con(arr,x));
     // }
    
     //    public static void main(String[] args) {
     //       int[] arr={1, 2, 3, 4, 5};
     //       int[] arr2={arr.length};
     //       int i;
     //       for(i=0; i<arr.length; i++){
     //            arr2[i]=arr[i];
     //       }
     //       System.out.println("Original Array");
     //       for(i=0; i<arr.length;i++){
     //            System.out.println(arr[i]+" ");
     //       }
     //       System.out.println("Copied Array");
     //       for(i=0; i<arr2.length; i++){
     //            System.out.println(arr2[i]+" ");
     //       }
     //    }
    
}
