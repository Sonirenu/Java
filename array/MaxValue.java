package array;

public class MaxValue {
   static void max(){
       int[] arr={5,8,2,3,4,9,15};
       //int[] arr={5,5,5,5,5,5};
        int ans=0;
        for(int i=0;i<arr.length; i++){
            if(arr[i]>ans){
            ans=arr[i];
            
        
            System.out.println(arr[i]);
            }
        }
    }
    public static void main(String[] args) {
        //MaxValue obj=new MaxValue();
        //obj.max();
        max();
    }
}
