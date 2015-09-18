import java.util.Scanner;

public class Average{

public static void main(String[] args){

Scanner input=new Scanner(System.in);

double a, b, c, average;

System.out.println("Enter the 1st number: ");

a = input.nextDouble();

System.out.println("Enter the 2nd number: ");

b = input.nextDouble();

System.out.println("Enter the 3rd number: ");

c = input.nextDouble();

average=(a+b+c)/3;

System.out.println("The average is "+average);

}

}