import java.util.Scanner;
public class L13{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("n=");
        double n=input.nextDouble();
        double harmonic=0;
        for (double h=1;h<=n;h++){
            //System.out.println(h);
            //System.out.println(1/h);
            harmonic=1/h+harmonic;
            
        }
        System.out.println("Sum="+harmonic);
    }
}
// More decimal points are dropped in this case
// Counting is more accurate from right to left