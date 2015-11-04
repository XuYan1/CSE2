// Xu Yan
// CSE 002
// 10/24/2015
// HW 09 - Computing Area
import java.util.Scanner;
public class areas{
    public static double area(double r){
        return (r*r*3.1415);
    }
    public static double area(double l, double w){
        return (l*w);
    }
    public static double area(double b1, double b2, double h){
        return ((b1+b2)*h/2);
    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        String shape="n";
        while(true){
            while (!shape.equals("circle")&&!shape.equals("rectangle")&&!shape.equals("trapezoid")&&!shape.equals("ex")){
                System.out.print("Enter a shape (enter ex to exit the program): ");
                shape=input.next();
            }
            if (shape.equals("ex")){break;}
            if (shape.equals("circle")){
                System.out.print("Enter the radius: ");
                double r=input.nextDouble();
                System.out.print("Area: "+area(r));
            }
            if (shape.equals("rectangle")){
                System.out.print("ENter the length: ");
                double l=input.nextDouble();
                System.out.print("Enter the width: ");
                double w=input.nextDouble();
                System.out.print("Area: "+area(l,w));
            }
            if (shape.equals("trapezoid")){
                System.out.print("Enter the length of base 1: ");
                double b1=input.nextDouble();
                System.out.print("Enter the length of base 2: ");
                double b2=input.nextDouble();
                System.out.print("Enter the height: ");
                double h=input.nextDouble();
                System.out.print("Area: "+area(b1,b2,h));
            }
            shape="n";
            System.out.println("");
        }   
    }
}