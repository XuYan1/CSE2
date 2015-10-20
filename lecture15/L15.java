public class L15{
    public static void h(){
        System.out.println("hi");
    }
    public static int add(int a, int b){
        int c=a+b;
        return c;
    }
    public static boolean isDiv2(int a){
        return a%2==0;
    }
    public static String hi(String s){
        return "hi " +s;
    }
    public static void main(String[] args){
    h();
    int c=add(1,2);
    System.out.println(c);
    System.out.println(isDiv2(c));
    System.out.println(hi("cups"));
}
}
