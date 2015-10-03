// Xu Yan
// 10/3/2015
// CSE 002 - HW06 - Pyramid
// This program prompts the user to enter the height of the pyramid the want, and
// displays a pyramid of that height.

import java.util.Scanner;
public class pyramid{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the height of the desired pyramid: ");
        int h=input.nextInt();
        for (int i=1; i<=h; i++){
            if (h-i>0){
                for (int a=1; a<=h-i; a++){
                    System.out.print(" ");
                }
            }
            for (int b=1; b<=2*i-1; b++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}