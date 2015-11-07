// Basic binary search
//
// Suppose you have an array
//          [1 2 3 4 5 6 7 8 9]
// With a linear search, you will go through each item until you find the desired one
// A binary search splits the array in half and searches a random half
// If that half does not generate a result, then the other half is split and the process is repeated
// So..
// 1. the midpoint is chosen, in this case, it's 5
// 2. the half [6 7 8 9] is chosen, and the new midpoint is chosen, 6 and 7
// 3. The target 7 has been found
// This method is usually written recursively
// This is generally a better method than linear search

// 2-D arrays
public class l21{
    public static void main(String[] args){
        int[][] arr=new int[10][10];    // This declares a 2-D array, with the size 10 x 10
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){ arr[i][j]=0;}
        }
        int nBombs=0;
        while(nBombs<10){
            int x=(int)Math.random()*10;
            int y=(int)Math.random()*10;    // Generates random numbers
            if (arr[x][y]!=1){arr[x][y]=1; nBombs++;}   // Eliminates repeats
        }
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){ System.out.print(arr[i][j]+"\t");}
        }
    }
}
