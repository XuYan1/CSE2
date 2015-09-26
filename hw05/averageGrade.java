// Xu Yan
// 10/1/2015
// CSE 002 - hw05 - average grade

import java.util.Scanner;
public class averageGrade{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        boolean c=true;
        double grade=0;
        double total=0;
        int counter=1;
        while (c==true){
            System.out.println("Enter grade #"+counter+": ");
            System.out.println("Enter 999 to stop grade input");
            grade=input.nextInt();
            if (grade==999){
                c=false;
            }
            else if (grade<0 || grade>100){
                System.out.println("Invalid input");
            }
            else {
                counter=counter+1;
                total=total+grade;
            }
        }
        counter-=1;
        double average=total/counter;
        System.out.println("Your average grade of the "+counter+
        " assignments is "+average);
}
}