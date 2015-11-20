// Non-static fields/methods
// When a non-static method is created, a new object must be constructed before
// calling the method
public class l25{
    int a=1;    // a is declared as a non-static variable
    static int b=2; // b is declared as a static variable
    public void setA(int x){
        a=x;
    }
    public int getA(){
        return a;
    }
    public static void printM(){
        System.out.println("hi");
    }
    public static void main(String[] args){
        l25 c= new l25();       // creating object c
        l25 d= new l25();       // creating object d
        c.printM();
        System.out.println("c.a = "+c.getA());
        System.out.println("d.a = "+d.getA());
        c.setA(5);
        d.setA(6);
        System.out.println("c.a = "+c.getA());
        System.out.println("d.a = "+d.getA());
        System.out.println("c.b = "+c.b);
        System.out.println("d.b = "+d.b);
    }
}