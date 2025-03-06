class Board {
    char board[][] = {{'-','-','-'},
    {'-','-','-'},
    {'-','-','-'}};


    void print(){
        for(int i=0;i<3;i++){
            System.out.println(board[i]);
        }
    }

    Boolean check(){
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

    void move(int x, int y, Player player){
        if(board[y][x] == '-'){
            board[y][x] = player.symbol;
        }
    }

    Boolean isFull(){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(board[i][j] == '-') return false;
            }
        }
        return true;
    }
}
