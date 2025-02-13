import java.util.*;

public class TicTacToe {
    static char board[][] = {{'-','-','-'},
    {'-','-','-'},
    {'-','-','-'}};


    static void printBoard(){
        for(int i=0;i<3;i++){
            System.out.println(board[i]);
        }
    }

    static Boolean check(){
        if(board[0][0] != '-' && board[0][0] == board[0][1] && board[0][1] == board[0][2]) return true;
        else if(board[1][0] != '-' && board[1][0] == board[1][1] && board[1][1] == board[1][2]) return true;
        else if(board[2][0] != '-' && board[2][0] == board[2][1] && board[2][1] == board[2][2]) return true;
        else if(board[0][0] != '-' && board[0][0] == board[1][0] && board[1][0] == board[2][0]) return true;
        else if(board[0][1] != '-' && board[0][1] == board[1][1] && board[1][1] == board[2][1]) return true;
        else if(board[0][2] != '-' && board[0][2] == board[1][2] && board[1][2] == board[2][2]) return true;
        else if(board[0][0] != '-' && board[0][0] == board[1][1] && board[1][1] == board[2][2]) return true;
        else if(board[2][0] != '-' && board[2][0] == board[1][1] && board[1][1] == board[0][2]) return true;
        return false;
    }

    static Boolean isFull(){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(board[i][j] == '-') return false;
            }
        }
        return true;
    }

    public TicTacToe(){
        Scanner sc = new Scanner(System.in);

        int x, y, turn = 0, win = 0;

        while(win == 0){
            if(turn % 2 == 0) {
                System.out.print("Player 1 move: ");
            }else{
                System.out.print("Player 2 move: ");
            }
            do { 
                x = sc.nextInt();
                y = sc.nextInt();
            } while (x < 0 || x > 2 || y < 0 || y > 2 || board[y][x] != '-');

            if(turn % 2 == 0) {
                board[y][x] = 'O';
            }else{
                board[y][x] = 'X';
            }
            turn++;
            printBoard();
            if(check()){
                if(turn % 2 == 0) System.out.println("Player 1 wins");
                else System.out.println("Player 2 wins");
                break;
            }else{
                if(isFull()){
                    System.out.println("Tied"); break;
                }
            }
        }
        sc.close();
    }
    public static void main(String[] args) {
        new TicTacToe();
    }
}
