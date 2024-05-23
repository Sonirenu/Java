package ifelse;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
public class NestedIf {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        if(n<=18)
        {
            System.out.println("child");
        }
        else if(n==18)
        {
            System.out.println("adult");
        }
        else if(n>=50){
             System.out.println("old");
        }
        else{
            System.out.println("thank you");
        }
    }
}
