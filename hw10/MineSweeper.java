import java.util.Scanner;
public class MineSweeper{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int n=0;
        int numMines=-1;
        int x,y;
        while(n<2||n>30){
            System.out.print("Enter the desired size of the board: ");
            n=input.nextInt();
        }
        String[][] board=new String[n][n];
        while(numMines<0||numMines>n*n){
            System.out.print("Enter the desired number of mines: ");
            numMines=input.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]="0";
            }
        }
        for(int i=0;i<numMines;i++){
            x=(int)(Math.random()*n);
            y=(int)(Math.random()*n);
           while(board[x][y].equals("M")){
               x=(int)(Math.random()*n);
               y=(int)(Math.random()*n);
           }
           board[x][y]="M";
        }
        board[1][2]="-1";
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(!board[i][j].equals("M")){
                    if(i==0){
                        if(j==0){
                            if(board[i+1][j].equals("M")){count++;}
                            if(board[i+1][j+1].equals("M")){count++;}
                            if(board[i][j+1].equals("M")){count++;}
                        }
                        else if(j==n-1){
                            if(board[i+1][j].equals("M")){count++;}
                            if(board[i][j-1].equals("M")){count++;}
                            if(board[i+1][j-1].equals("M")){count++;}
                        }
                        else{
                            if(board[i][j-1].equals("M")){count++;}
                            if(board[i][j+1].equals("M")){count++;}
                            if(board[i+1][j-1].equals("M")){count++;}
                            if(board[i+1][j].equals("M")){count++;}
                            if(board[i+1][j+1].equals("M")){count++;}
                        }
                    }
                    else if(i==n-1){
                        if(j==0){
                            if(board[i-1][j].equals("M")){count++;}
                            if(board[i-1][j+1].equals("M")){count++;}
                            if(board[i][j+1].equals("M")){count++;}
                        }
                        else if(j==n-1){
                            if(board[i-1][j].equals("M")){count++;}
                            if(board[i][j-1].equals("M")){count++;}
                            if(board[i-1][j-1].equals("M")){count++;}
                        }
                        else{
                            if(board[i-1][j].equals("M")){count++;}
                            if(board[i-1][j-1].equals("M")){count++;}
                            if(board[i][j-1].equals("M")){count++;}
                            if(board[i][j+1].equals("M")){count++;}
                            if(board[i-1][j+1].equals("M")){count++;}
                        }
                    }
                    else{
                        if(j==0){
                            if(board[i-1][j].equals("M")){count++;}
                            if(board[i+1][j].equals("M")){count++;}
                            if(board[i-1][j+1].equals("M")){count++;}
                            if(board[i][j+1].equals("M")){count++;}
                            if(board[i+1][j+1].equals("M")){count++;}
                        }
                        else if(j==n-1){
                            if(board[i-1][j].equals("M")){count++;}
                            if(board[i+1][j].equals("M")){count++;}
                            if(board[i-1][j-1].equals("M")){count++;}
                            if(board[i][j-1].equals("M")){count++;}
                            if(board[i+1][j-1].equals("M")){count++;}
                        }
                        else{
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
                    count=0;
                }
            }
            
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(board[i][j]+"\t");
            }
            System.out.println("");
        }
    }
}