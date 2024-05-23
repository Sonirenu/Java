public class CheckArmstrong {
    public static void main(String[] args) {
        int n=153, temp=n, sum=0;
        // function to calculate the sum of individual digit
        while(n>0){
            int rem=n%10;
            System.out.println(rem);
            sum+=Math.pow(rem,3);
            System.out.println(sum);
            n=n/10;
            System.out.println(n);
        }
       // conditon to check wheather the value of sum equals to user input or not
       if(temp==sum){
        System.out.println("yes,it is a Armastrong number");
       }
       else{
        System.out.println("No, it is not a Armstrong number");
       }
        }  
    }

