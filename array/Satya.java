package array;

public class Satya {
    public static void main(String[] args){
      int num =1234, first, last, second,third, prod, sum;
      int rem, coun=1, temp, tempcount=0;
      System.out.println(num);
      temp=num;

      while(temp>0){
        tempcount++;
        temp/=10;
      }
      if(tempcount==4){
        while(num>0){
          rem=num%10;
          if(coun==1)
          first=rem;
        //System.out.println(first);}
          else if(coun==2)
          second=rem;
         // System.out.println(second);}
          else if(coun==3)
          third=rem;
        //System.out.println(third);}
          else if(coun==4)
          last=rem;
          //System.out.println(last);}
          num=num/10;
          coun++;
        }
        sum= second + third;
        System.out.println(sum);

      }
      else
        System.out.println(num);
      



    //   int last=n%10;
      
    //   System.out.println(last);
    //   while(n>=10){
    //    // n/=10;
    //     n%=10;
        
    //   }
      
    //   System.out.println(n);


        //  int a=1, b=2, c=3, d=4;
        //  int temp;
        //  temp=a;
        //  a=d;
        //  d=temp;

        //  System.out.println(a+" "+b+" "+c+" "+d);
        






        // int a =10;
        // int b=12;
        // int sum = (a*a)+(b*b);
        // System.out.println(sum);
        // int cube =(a*a*a)+(b*b*b);
        // System.out.println(cube);

    
    
    
}
}
