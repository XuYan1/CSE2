// Xu Yan
// CSE 002
// Lab 03 - Check
// 
// The purpose of this program is to write a program that evenly splits a check
// between multiple people evenly. The program uses the Scanner class to obtain
// information from the user and use the inputs to calculate how much each 
// person needs to pay.

// imports the scanner class
    import java.util.Scanner;
// declares the main class
public class Check{
// adds the main method
    public static void main(String[] args){
// calls the Scanner constructor
        Scanner myScanner = new Scanner(System.in);
// inputting the cost of the check
        System.out.println("The original cost of the check in the form xx.xx: ");
// inputting the cost of the check by calling myScanner; the "nextDouble" command stores your input as a double
        double checkCost = myScanner.nextDouble();
// inputing the desired tip rate
        System.out.println("The percentage tip that you wish to pay as a whole number (in the form xx): ");
        double tipPercent = myScanner.nextDouble();
        tipPercent /= 100;
// inputting the number of people that came to dinner; the "nextInt" command stores the input as a integer
        System.out.println("The number of people who went out for dinner");
        int numPeople = myScanner.nextInt();
// calculates the output
        double totalCost;
        double costPerPerson;
        int dollars, dimes, pennies;            // this is to store the cost
        totalCost=checkCost*(1+tipPercent);
        costPerPerson=totalCost/numPeople;
        dollars=(int)costPerPerson;
        dimes=(int)(costPerPerson*10)%10;       // the % sign is used to get the remainder after division, in this case it takes the first decimal place
        pennies=(int)(costPerPerson*100)%10;    // storing the 2nd decimal place of the cost per person as pennies
        System.out.println("Each person in the group owns $"+dollars+'.'+dimes+pennies);
    }
}