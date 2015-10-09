// Xu Yan
// 10/9/2015
// CSE 002 - Lab 07 - Encrypted X
//
// This program asks the user to enter an integer between 0-100, and displays 
// the letter x as blank spaces between the asterisks.

import java.util.Scanner;       // imports the scanner class
public class encrypted_x{       // declares the class
    public static void main(String[] args){     // declares the main method
        Scanner input=new Scanner(System.in);   // constructs the scanner
        int size=-1;        // declares the size variable
        int i,j;            // declares the counters
        while (size<0 || size>100){     // input request loop
            System.out.println("Enter the desired size: ");
            size=input.nextInt();
        }
        for (i=1;i<=size+1;i++){    // repeats for size+1 lines
            for (j=1;j<=size+1;j++){    // prints the stuff on each line
                if (j==i){          // first space location
                    System.out.print(" ");
                }
                else if (j==size+2-i){  // 2nd space location
                    System.out.print(" ");
                }
                else{                   // prints the asterisks everywhere else
                    System.out.print("*");
                }
            }
            System.out.println("");     // starts a new line
        }
    }
}