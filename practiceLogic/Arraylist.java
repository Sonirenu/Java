//import java.lang;
import java .util.ArrayList;
public class Arraylist{
 public static void main(String[] args) {

    Integer in = Integer.valueOf(4);
    System.out.println(in);
    Float f = Float.valueOf(0.4f);
    System.out.println(f);
   // String s = Integer.toString(i, f);
    //System.out.println(s);

    ArrayList<Integer> arr = new ArrayList<>();
     //add new element

     arr.add(5);
     arr.add(6);

     //get  an element
     System.out.println(arr.get(0));
        
     //print with foe loop

     for(int i=0; i<arr.size(); i++)
     {
        System.out.println(arr.get(i));
     }

     //printing the array list directly
       System.out.println(arr);

       //adding element at some index i
        arr.add(1, 100);
        System.out.println(arr);

        //modifying element at some index i
        arr.set(1, 10);
        System.out.println(arr);

        //removing an element at some index i
        arr.remove(2);
        System.out.println(arr);

        //remove an element e
        arr.remove(Integer.valueOf(5));
        System.out.println(arr);

       System.out.println(arr.remove(Integer.valueOf(5)));

       //checking if an element exists
       boolean ans = arr.contains(Integer.valueOf(60));
       System.out.println(ans);

       //if you dont specify class, u can put anything inside l
       ArrayList l = new ArrayList();
       l.add("aman");
       l.add(67);
       l.add(true);
       System.out.println(l); 

    }
}