// Xu Yan
// 9/24/2015
// CSE 002 - Lab 05 - CalculatorSpecial
//
// This program prompts the user to enter two integers and one simple mathematic
// operator. If the operation is legal, the operation will be run. Otherwise, the
// program will return the statement "Illegal operator"
//
// This progame is a continuation of the week 4 lab. It asks the user to whether
// to repeat the program at the end or not. The user can type n or N to quit.

import java.util.Scanner;       // Imports the Scanner class
public class CalculatorSpecial{        // Declares the Calculator class
    public static void main(String[] args){     // Calculator is made the main method
        Scanner input=new Scanner(System.in);   // Creates a scanner function called input
        double a,b,c;           // Declares the variables a, b, and c
        boolean check=true;
        while(check==true){
        System.out.println("Enter the first integer: ");
        a=input.nextDouble();   // Inputting number a
        System.out.println("Enter the second integer: ");
        b=input.nextDouble();   // Inputting number b
        System.out.println("Enter the operator: ");
        String op=input.next(); // Inputting the operator
        switch (op) {           // Checks if the operator is legal
            case "*" : 
                c=a*b;
                System.out.println("The product of a and b is: "+c);
                break;
            case "/" :
                c=a/b;
                System.out.println("The quotient of a and b is: "+c);
                break;
            case "+" :
                c=a+b;
                System.out.println("The sum of a and b is: "+c);
                break;
            case "-" :
                c=a-b;
                System.out.println("The difference of a and b is: "+c);
                break;
            default :
                System.out.println("Illegal operator");
        }
        System.out.println("Type n or N to stop ");
        String y=input.next();
        if ((y).equals("n") || (y).equals("N")) {
            check=false;
        }
        }
    }
}
