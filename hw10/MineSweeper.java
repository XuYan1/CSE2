import java.util.Scanner;       // Imports the Scanner class
public class MineSweeper{       // Class declaration
    public static void main(String[] args){     // Main method
        Scanner input=new Scanner(System.in);   // Scanner constructor
        int n=0;                // Number of rows/columns
        int numMines=-1;        // Number of mines
        int x,y;                // Coordinate of each mine
        while(n<2||n>30){       // Board size criteria
            System.out.print("Enter the desired size of the board: ");
            n=input.nextInt();  // User inputs board size
        }
        String[][] board=new String[n][n];      // Sets up the board (2x2 array)
        while(numMines<0||numMines>n*n){        // Prompts to user for the number of mines
            System.out.print("Enter the desired number of mines: ");
            numMines=input.nextInt();       
        }
        for(int i=0;i<n;i++){                   // Fills the board with zeros (no mines)
            for(int j=0;j<n;j++){
                board[i][j]="0";
            }
        }
        for(int i=0;i<numMines;i++){            // Randomly laying mines
            x=(int)(Math.random()*n);
            y=(int)(Math.random()*n);
           while(board[x][y].equals("M")){      // Preventing repeats
               x=(int)(Math.random()*n);
               y=(int)(Math.random()*n);
           }
           board[x][y]="M";
        }
        int count=0;                            // Adjacent mine counter
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(!board[i][j].equals("M")){
                    if(i==0){
                        if(j==0){               // Special case: upper left corner
                            if(board[i+1][j].equals("M")){count++;}
                            if(board[i+1][j+1].equals("M")){count++;}
                            if(board[i][j+1].equals("M")){count++;}
                        }
                        else if(j==n-1){        // Special case: lower right corner
                            if(board[i+1][j].equals("M")){count++;}
                            if(board[i][j-1].equals("M")){count++;}
                            if(board[i+1][j-1].equals("M")){count++;}
                        }
                        else{                   // Special case: leftmost column
                            if(board[i][j-1].equals("M")){count++;}
                            if(board[i][j+1].equals("M")){count++;}
                            if(board[i+1][j-1].equals("M")){count++;}
                            if(board[i+1][j].equals("M")){count++;}
                            if(board[i+1][j+1].equals("M")){count++;}
                        }
                    }
                    else if(i==n-1){            
                        if(j==0){               // Special case: upper right corner
                            if(board[i-1][j].equals("M")){count++;}
                            if(board[i-1][j+1].equals("M")){count++;}
                            if(board[i][j+1].equals("M")){count++;}
                        }
                        else if(j==n-1){        // Special case: lower right corner
                            if(board[i-1][j].equals("M")){count++;}
                            if(board[i][j-1].equals("M")){count++;}
                            if(board[i-1][j-1].equals("M")){count++;}
                        }
                        else{                   // Special case: rightmost column
                            if(board[i-1][j].equals("M")){count++;}
                            if(board[i-1][j-1].equals("M")){count++;}
                            if(board[i][j-1].equals("M")){count++;}
                            if(board[i][j+1].equals("M")){count++;}
                            if(board[i-1][j+1].equals("M")){count++;}
                        }
                    }
                    else{
                        if(j==0){               // Special case: top row
                            if(board[i-1][j].equals("M")){count++;}
                            if(board[i+1][j].equals("M")){count++;}
                            if(board[i-1][j+1].equals("M")){count++;}
                            if(board[i][j+1].equals("M")){count++;}
                            if(board[i+1][j+1].equals("M")){count++;}
                        }
                        else if(j==n-1){        // Special case: bottom row
                            if(board[i-1][j].equals("M")){count++;}
                            if(board[i+1][j].equals("M")){count++;}
                            if(board[i-1][j-1].equals("M")){count++;}
                            if(board[i][j-1].equals("M")){count++;}
                            if(board[i+1][j-1].equals("M")){count++;}
                        }
                        else{                   // Everywhere else
                            if(board[i-1][j].equals("M")){count++;}
                            if(board[i-1][j-1].equals("M")){count++;}
                            if(board[i-1][j+1].equals("M")){count++;}
                            if(board[i][j-1].equals("M")){count++;}
                            if(board[i][j+1].equals("M")){count++;}
                            if(board[i+1][j].equals("M")){count++;}
                            if(board[i+1][j-1].equals("M")){count++;}
                            if(board[i+1][j+1].equals("M")){count++;}
                        }
                    }
                    board[i][j]=Integer.toString(count);
                    count=0;                    // Counter reset
                }
            }
            
        }
        for(int i=0;i<n;i++){                   // Prints board
            for(int j=0;j<n;j++){
                System.out.print(board[i][j]+"\t");
            }
            System.out.println("");
        }
    }
}