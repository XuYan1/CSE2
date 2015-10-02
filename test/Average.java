import java.util.Scanner;
public class Average {
        public static void main(String args[]) 
        {    
int p = 3, q = 1, sum = 0;
while (p <= 10)
{
     sum += p % q;
     p++;
     q++;
}
System.out.println(sum);
}
}