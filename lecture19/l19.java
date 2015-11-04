import java.util.Scanner;
public class l19{
    public static void main(String[] args){
        int[] arr; // Declares a new array
        arr = new int[5];   // The new array is of size 5
                            // The array position goes from 0 to length-1
                            // So here it's from 0 to 4
                            // The command arr[i] gets the calue at position i in the array
        for(int i=0;i<5;i++){   // Adding values into an array with a for loop
            arr[i]=2*i;
            System.out.println(arr[i]);
        }
        int j=0;
        while(j<5){             // Adding values into an array with a while loop
            arr[j]=j+1;
            System.out.println(arr[j]);
            j++;
        }
        String[] arr1=new String[5];  // This array contains strings
        for(int i=0;i<5; i++){
            arr1[i]="arr1"+arr[i];
            System.out.println(arr1[i]);
        }
        System.out.println(arr[0]);
    }
}