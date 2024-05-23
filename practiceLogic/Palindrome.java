public class Palindrome {
    public static void main(String[] args){
        int n=393, rev=0,rem,temp=n;
        //loop to find reverse number
        while(temp!=0){
            rem=temp%10;
            System.out.println(rem);
            rev=rev*10+rem;
            System.out.println(rev);
           temp/=10;
           // System.out.println(temp);
        }
        //palindrome if number and reverse are equal
        if(n==rev)
        System.out.println(n+" is a palindrome ");
        else
        System.out.println(n+" is Not a Palindrome ");
    }
}
