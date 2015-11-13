import java.util.Scanner;       // Imports Scanner class
public class move_array{
    public static void main(String[] args){
        int size,index,temp,temp2;    // Declares variables
        int[] arr;              // Declares the array to be operated on
        Scanner input=new Scanner(System.in);   // Constructs scanner
        System.out.print("Please enter the size of the array: ");
        size=input.nextInt();   // Gets the size of the array
        try{                    // Trying to catch a negative size 
            arr=new int[size];
        } catch(NegativeArraySizeException e){
            System.err.println("Error: Invalid array size");
            while(size<1){
                System.out.print("Please enter a valid size: ");
                size=input.nextInt();
            }
        }
        try{                    // Trying to catch size=0
            temp=1/size;
        } catch(ArithmeticException e){
            System.err.println("Error: Invalid array size");
            while(size<1){
                System.out.print("Please enter a valid size: ");
                size=input.nextInt();
            }
        }
        arr=new int[size];
        System.out.println("Original array: "); // Prints the unoperated array
        for(int i=0;i<size;i++){
            arr[i]=(int)(Math.random()*100);
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
        System.out.print("Please enter the index of the value to be moved: ");
        index=input.nextInt();  // Gets the index of the number to be moved
        try{                    // Trying to catch an error that is out of bounds
            temp=arr[index];
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.err.println("Error: Not within array bounds");
            while (index >= arr.length||index<0) {
                System.out.print("Enter an appropriate index: ");
                index = input.nextInt();
            }
        }
        temp=arr[index];
        for(int j=index;j<arr.length-1;j++){     // Switching values
            temp2=arr[j+1];
            arr[j]=temp2;
        }
        arr[arr.length-1]=temp;
        System.out.print("Number at index "+index+" was moved to the end: ");
        for(int i=0;i<size;i++){                // prints the operated array
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }
}