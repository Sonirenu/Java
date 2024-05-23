package array;
import java.util.*;




public class TwoPointer {
    static void printArray(int[] arr){
        int n=arr.length;
        for(int i=0; i<n; i++){
        System.out.println(arr[i] + " ");
        }
    }



    static void reverse(int[] arr){
        int i=0;
       int j= arr.length-1;
       while(i<j){
        swap(arr, i, j);
        i++;
        j--;
       }

    }

    // static void sortZeroAndOne(int[] arr){
    //     int n =arr.length;
    //     int zero=0;
    //     for(int i=0; i<n; i++){
    //         if(arr[i]==0){
    //             zero++;
    //         }
    //     }
    //         for(int i=0; i<n; i++){
    //             if(i<zero){
    //              arr[i]=0;
    //             }
    //             else
    //             arr[i]=1;
    //         }

    static void swap(int[] arr ,int i, int j){

        int temp=arr[i];
        arr[i]=arr[j];
         arr[j]=temp;
    }





        static void sortZeroAndOne(int[] arr){
            int n= arr.length;
            int left=0; int right=n-1;
            while(left<right){
                if(arr[left]==1 && arr[right]==0){
                    swap(arr,left,right);
                    left++;
                    right--;
                }
                while(left>right){
                    if(arr[left]==0){
                        left++;
                    }
                    if(arr[right]==1){
                        right--;
                    }
                }
            }
        }


     static void sortParity(int[] arr){
        int n= arr.length;
        int left=0; int right= n-1;
        while(left<right){
            if(arr[left]%2==1 && arr[right]%2==0){
                swap(arr,left,right);
                left++;
                right--;
            }
            if(arr[left]%2==0){
                left++;
            }
            if(arr[right]%2==1){
                right--;
            }
        }
     }



     static int[] sortSquares(int[] arr){
        int n= arr.length;
        int left=0, right=n-1;
         int[] ans=new int[n];
         int k=0;
     while(left<=right){
            if(Math.abs(arr[left])>Math.abs(arr[right])){
                 ans[k++]=arr[left]*arr[left];
                 left++;
            }
            else{
                ans[k++]=arr[right]*arr[right];
                right--;
            }
         }return ans;
     }



    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int n= sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the "+ n+ " Element");
        for(int i=0; i<arr.length;i++){
        arr[i]=sc.nextInt();
        }
        System.out.println("Original Array ");//1 0 0 1 0
        printArray(arr);
        int[] ans=sortSquares(arr);
        sortParity(arr);     //op:1 4 6 3 2 5 Ip:2 4 6 1 3 5
        sortZeroAndOne(arr);// 0 0 0 1 1
        
        System.out.println("Sorted array ");
        reverse(ans);   
        printArray(ans);
        

    }
    
}
