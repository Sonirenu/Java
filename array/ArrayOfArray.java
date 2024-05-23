package array;

public class ArrayOfArray {
    void multiArray(){
        int[][] num={{56,34,6},{34,7,9}};
        for(int i=0; i<num.length; i++){
            for(int j=0; j<num[i].length; j++){
               System.out.println(num[i][j]);
            }
        }
    }
    public static void main(String[] args) {
        ArrayOfArray obj=new ArrayOfArray();
        obj.multiArray();
    }
}
