import java.util.Scanner;       // Imports the scanner class
public class Rectangle{         // Sets the rectangle clas
    double width;               // Declares the width field
    double height;              // Declares the height field
    public void setWidth(double x){width = x;}              // Sets the height
    public void setHeight(double x){height = x;}            // Sets the width
    public double getArea(){return width*height;}           // Returns the area
    public static void main(String[] args){                 // Main method of class Rectangle
        Rectangle r1=new Rectangle();                       // Declares a new object r1
        double a;                                           // Static variable used to input data
        Scanner input=new Scanner(System.in);               // Constructs a new scanner object
        System.out.println("Enter the desired height: ");   // Prompts the user to enter the height
        a=input.nextDouble();
        r1.setHeight(a);                                    // Sets the height of the object r1
        System.out.println("Enter the desired width: ");
        a=input.nextDouble();
        r1.setWidth(a);                                     // Sets the width of object r1
        System.out.println("The area is "+r1.getArea());    // Prints the area
    }
}