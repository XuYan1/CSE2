// Xu Yan
// 10/22015
// CSE 002 - Lab 06 - Time Sheets
// This program prompts the user to input the number of hours worked by each employee
// and their wage. The program then spits out the total payroll of all employees.
import java.util.Scanner;       // Imports the scanner class
public class timeSheets{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);   // Declares a new scanner construct
        int n=-1;           // # of employees
        double wage;        // declares the wage, totalpay, and hour variables
        double totalpay=0;
        double hour;
        while (n<=0){       // Checks whether the number of employees is valid
        System.out.print("Enter the number of employees: ");
        n=input.nextInt();
        }
        for(int i=1; i<=n; i++){    // Checks each employee
            System.out.print("Enter the hourly wage of employee "+i+" : ");
            wage=input.nextDouble();    // Wage of employee i
            for(int j=1; j<=5; j++){    // Checks the hours of employee i
                System.out.print("Enter the hours employee "+i+
                " worked on day "+j+" of the week: ");
                hour=input.nextDouble();
                totalpay=totalpay+hour*wage;
            }
        }
        int totalD=(int)(totalpay*100);       // Rounding to two floating decimals
        totalpay=totalD/100;
        System.out.println("The total payroll of all employees is $"+totalpay);
    }
}