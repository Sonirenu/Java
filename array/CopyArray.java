package array;

public class CopyArray {
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5};
        int arr2[]={arr1.length};
        int i;
        for( i=0; i<arr1.length; i++){
            arr2[i]=arr1[i];
        }
        System.out.println("Element of an original array");
        for( i=0; i<arr1.length; i++){
            System.out.println(arr1[i]+" ");
        }
        System.out.println("Element of new array");
        for( i=0; i<arr2.length; i++){
            System.out.println(arr2[i]+" ");
        }
    }
}
