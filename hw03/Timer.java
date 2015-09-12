// Xu Yan
// CSE 002
// HW03 - Program #1 - Timer
// This program asks the user to input the current time and when he/she will be eating dinner
// and calculates how much time there is between the two.

// Importing Scanner
import java.util.Scanner;
// Class Declaration
public class Timer{
// Adding Main Method
    public static void main(String[] args){
// Calls the Scanner Constructor
        Scanner timeIn = new Scanner(System.in);
// Input Current Time
        System.out.println("Enter the current time in military time: ");
        int nowTime = timeIn.nextInt();
// Input Dinner Time
        System.out.println("Enter dinner time in military time: ");
        int dinTime = timeIn.nextInt();
// Calculations
        int nowTimeMin;
        nowTimeMin = (nowTime-(int)(nowTime/100)*100)+(int)(nowTime/100)*60;
        int dinTimeMin;
        dinTimeMin = (dinTime-(int)(dinTime/100)*100)+(int)(dinTime/100)*60;
        int timeDiffTOT;
        timeDiffTOT = dinTimeMin - nowTimeMin;
        int timeDiffHr, timeDiffMin;
        timeDiffHr = (int)(timeDiffTOT/60);
        timeDiffMin = timeDiffTOT-timeDiffHr*60;
// Displaying Time Differenece
        System.out.println("You have "+timeDiffHr+" hours and "+timeDiffMin+
        " minutes until dinner.");
    }
}