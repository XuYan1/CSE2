public class l17{
    public static void ov(int x){
        System.out.println(x);
    }
    public static void ov(int x,int y){
        System.out.println(x+y);
    }
    public static void ov(int x,String y){
        System.out.println(y+"is"+x);
    }
    public static void ov(String x,int y){
        System.out.println(y+"is"+x);
    }
    public static void ov(String x){
        System.out.println(x);
    }
    public static void ov(boolean x){
        System.out.println(x);
    }
    public static void main(String[] args){
        ov(5,"five");
        ov("five",5);
        ov(true);
    }
}