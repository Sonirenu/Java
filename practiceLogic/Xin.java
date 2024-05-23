public class Xin {
    void searchInArray(){
        int[] arr={10,5,3,7,8};
        int x=3;
        int ans=-1;
        for(int i=0;i<arr.length; i++){
            if(arr[i]==x){
            ans=i;}
        }
        System.out.println("found " +x+" at index "+ans);
            
    }
    public static void main(String[] args) {
        Xin obj=new Xin();
        obj.searchInArray();
    }
}
