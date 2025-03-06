import java.util.*;
class Game {
    int x, y, turn = 0, win = 0;
    Player player1 = new Player('O'); 
    Player player2 = new Player('X');
    Board board = new Board();
    
    void start(){
        Scanner sc = new Scanner(System.in);
        while(win == 0){
            if(turn % 2 == 0) {
                System.out.print("Player 1 move: ");
            }else{
                System.out.print("Player 2 move: ");
            }

            do{
                x = sc.nextInt();
                y = sc.nextInt();
                if(x < 0 || x > 2 || y < 0 || y > 2 || board.board[y][x] != '-'){
                    System.out.println("Invalid move");
                }
            }while(x < 0 || x > 2 || y < 0 || y > 2 || board.board[y][x] != '-');

            if(turn % 2 == 0) board.move(x, y, player1);
            else board.move(x, y, player2);
            board.print();            
            if(board.check()){
                if(turn % 2 == 0) System.out.println("Player 1 wins");
                else System.out.println("Player 2 wins");
                break;
            }else{
                if(board.isFull()){
                    System.out.println("Tied"); break;
                }
            }
            turn++;      
        }
        sc.close();
}
}
