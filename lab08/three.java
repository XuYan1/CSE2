// Xu Yan
// 10/16/2015
// CSE 002
// Lab 8 - mean and median
//
// This program prompts the user to enter 10 numbers, and calls a method to calculate
// the mean and median of the 10 numbers

import java.util.Scanner;   // Imports the scanner class
public class three{         
    public static double mean(double n1,double n2,double n3,double n4,double n5,double n6,double n7,double n8,double n9,double n10){
        double sum=n1+n2+n3+n4+n5+n6+n7+n8+n9+n10;
        return sum/10;      // Adds up the 10 numbers and calculates the mean
    }
    public static double median(double n5,double n6){
        return (n5+n6)/2;   // Adds up the 5th and 6th entry and calculates the median
    }
    public static void res(double mn,double md){    // Prints results
        System.out.println("The mean is "+mn);
        System.out.println("The median is "+md);
    }
    public static void main(String[] args){         // Main method
        double n1,n2,n3,n4,n5,n6,n7,n8,n9,n10,mn,md;
        Scanner input=new Scanner(System.in);       // Creates a scanner
        System.out.println("Enter ten numbers: ");  // Prompts the user to enter 10 numbers
         n1=input.nextDouble();
         n2=input.nextDouble();
         n3=input.nextDouble();
         n4=input.nextDouble();
         n5=input.nextDouble();
         n6=input.nextDouble();
         n7=input.nextDouble();
         n8=input.nextDouble();
         n9=input.nextDouble();
         n10=input.nextDouble();
        mn=mean(n1,n2,n3,n4,n5,n6,n7,n8,n9,n10);    // calculates the mean
        md=median(n5,n6);                           // calculates the median
        res(mn,md);                                 // prints results
    }
}