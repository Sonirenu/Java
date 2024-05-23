package array;

public class Main {
    static void copyArray(int[] arr){
        for(int i=0; i<arr.length; i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println();
}
    public static void main(String[] args) {
        System.out.println("enter the element of array");
        int arr[]=new int[5];
        arr[0]=5;
        arr[1]=7;
        arr[2]=8;
        arr[3]=9;
        arr[4]=4;
        System.out.println("Original Array");
        copyArray(arr);
        System.out.println("Copied Array");
        int[] arr_2= arr;
        copyArray(arr_2);
        int[] arr_3=arr.clone();
        arr_3[0]=12;
        arr_3[3]=2;
        System.out.println("Original Array after change value ");
        copyArray(arr);
        System.out.println("Copied Array 2:");
        copyArray(arr_3);
         arr_2[0]=0;
         arr_2[4]=9;
         System.out.println("Original Array after change value ");
        copyArray(arr);
        System.out.println("Copied Array after change value");
        copyArray(arr_2);
        
    }
}
