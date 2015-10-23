import java.util.Random;        // imports the random class
import java.util.Scanner;       // imports the scanner class
public class coinflip{          // class
    public static void flip(){  // the single flip
        Random rand=new Random();   // random constructor
        int a=rand.nextInt(2);      // takes the random number
        if (a==1){System.out.println("Head"+a);}  // determines the outcome
        else {System.out.println("Tail"+a);}
    }
    public static void flip(int n){ // multiple flips
        Random rand=new Random();   // random constructor
        int c=0;                    // counter
        for (int i=1;i<n;i++){      // loops through each iteration
            int a=rand.nextInt(2);  // takes the random number
            if (a==1){c++;}         // determines the outcome
        }
        System.out.println("Heads: "+c);
        System.out.println("Tails: "+(n-c));
    }
    public static void main(String[] args){ // main method
        Scanner in=new Scanner(System.in);  // constructs the scanner
        int n=0;                            // initializing the variable n
        System.out.println("Enter the desired number of coin flips: ");
        n=in.nextInt();                     // takes an integer for n
        if (n==0){flip();}                  // determines which flip method to call
        else if (n<=100) {flip(n);}
    }
}