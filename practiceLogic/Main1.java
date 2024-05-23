class E{
    void control(){
   System.out.println("contro....");
}
}
class C extends E{
    void info(){
        System.out.println("information.......");
    }
}
class Tv extends C{
    void move(){
        System.out.println("Moving.....");
    }
}
class Mp extends Tv{
    void call(){
        System.out.println("Calling...");
    }
}


class Tv1{
    void moving(){
   System.out.println("Moving......");
    }
}
class Lcd_tv extends Tv1{
    void show(){
        System.out.println("Showing.......");
    }
}
class Led_tv extends Lcd_tv{
    void run(){
    System.out.println("Run.......");
    }
}
public class Main1 {
    public static void main(String[] args) {
        Mp m=new Mp();
        m.call();
        m.move();
        m.info();
        m.control();
        Led_tv l= new Led_tv();
        l.moving();
        l.show();
        l.run();

    }
    
}
