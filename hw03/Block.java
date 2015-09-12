// Xu Yan
// CSE 002
// HW03 - Program #2 - Block
// This program asks the user for the dimensions of a rectangular block and calculates
// the volume and surface area of the block

// Importing Scanner
import java.util.Scanner;
// Declaring Class
public class Block{
// Adding Main Method
    public static void main(String[] args){
// Constructing Scanner
        Scanner dimIn = new Scanner(System.in);
// Entering Measurements
        double l, w, h;
        System.out.println("Enter the length of the block: ");
        l = dimIn.nextDouble();
        System.out.println("Enter the width of the block: ");
        w = dimIn.nextDouble();
        System.out.println("Enter the height of the block: ");
        h = dimIn.nextDouble();
// Calculating Volume and Surface Area
        double V, area;
        V = l*w*h;
        area = 2*(l*w+w*h+h*l);
// Displaying Results
        System.out.println("The volume of the block of dimensions "+l+" x "+w+
        " x "+h+" is "+V+".");
        System.out.println("The surface area of the block is "+area+".");
}
}