//import java.util.*;
public class FindAllArmstrong {
    public static void isArmstrong(int l, int r){
        for(int i=l; i<=r; i++){
            int sum=0;
            int temp =i;
            while(temp>0){
                //finding the last digit
                int lastdigit= temp%10;
                //finding the sum
                sum+=Math.pow(lastdigit,3);
                temp/=10;
            }
           // condition to print the num if it is a armstrong number
           if(sum==i)
           {
            System.out.print(i+" ");
           }
        }
           System.out.println();
    }
    public static void main(String[] args) {
        int l=0, r=1000;
        isArmstrong(l, r);
        
    }
}
