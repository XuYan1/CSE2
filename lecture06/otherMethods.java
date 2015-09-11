public class otherMethods{
    public static double area(double height, double width){
        double A=height*width;
        return A;
    }
    public static void main(String[] args){
        double A=area(1,2);
        System.out.println(A);
        double B=area(1,3);
        System.out.println(B);
    }
}