// Xu Yan
// 10/30/2015
// Lab 10: Arrays

// This lab generates n integers for the user, then calculates the average and
// determines which integers were greater than the average.

import java.util.Scanner;   // imports the scanner class
public class average{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);   // constructs the scanner
        int[] arr;      // declares the array
        System.out.print("Number of values you wish to generate: ");
        int n=input.nextInt();  // takes the number of values the user wants
        arr=new int[n];         // formats the size of the array
        double sum=0;           // initializes the sum and average vars
        double avg;
        for(int i=0;i<n;i++){
            arr[i]=(int)(Math.random()*100);    // generates the array
        }
        System.out.println("The "+n+"numbers are: ");
        for(int i=0;i<n;i++){                   // spits out the numbers
            System.out.println(arr[i]);
        }
        for(int i=0;i<n;i++){
            sum=sum+arr[i];                     // calculates the sum
        }
        avg=sum/n;                              // calculates the average
        System.out.println("The average is "+avg);
        System.out.println("The numbers greater than or equal to the average are: ");
        for(int i=0;i<n;i++){
            if(arr[i]>=avg){                    // tests if the numbers are greater than the avg
                System.out.println(arr[i]);
            }
        }
    }
}