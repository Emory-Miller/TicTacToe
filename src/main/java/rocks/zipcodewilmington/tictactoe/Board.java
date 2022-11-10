package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {

    private Character[][] board;
    public Board(Character[][] matrix) {
        board = matrix;
    }

    public Boolean isInFavorOfX() {
        if(winsRowAll('X')) return true;
        if(winsColAll('X')) return true;
        if(winsDiag('X')) return true;
        return false;
    }

    public Boolean isInFavorOfO() {
        if(winsRowAll('O')) return true;
        if(winsColAll('O')) return true;
        if(winsDiag('O')) return true;
        return false;
    }

    public Boolean isTie() {
        if (isInFavorOfX() == false && isInFavorOfO() == false) return true;
        return false;
    }

    public String getWinner() {
        if (isInFavorOfO()==true) return "O";
        if (isInFavorOfX()==true) return "X";
        return "";
    }

    public boolean winsRowAll (char ch){
        if (winsRow(ch, 0)) return true;
        if (winsRow(ch, 1)) return true;
        if (winsRow(ch, 2)) return true;
        return false;
    }
    public boolean winsRow(char ch, int row){
        for (int col = 0; col < 3; col++){
            if (board[row][col] == ch){
                continue;
            } else {
                return false;
            }
        }
        return true;
    }

    public boolean winsColAll (char ch){
        if (winsCol(ch, 0)) return true;
        if (winsCol(ch, 1)) return true;
        if (winsCol(ch, 2)) return true;
        return false;
    }
    public boolean winsCol(char ch, int col){
        for (int row = 0; row < 3; row++){
            if (board[row][col] == ch){
                continue;
            } else {
                return false;
            }
        }
        return true;
    }

    public boolean winsDiag (char ch){
        if ((board[0][0].equals(ch) && board[1][1].equals(ch) && board[2][2].equals(ch)) || (board[2][0].equals(ch) && board[1][1].equals(ch) && board[0][2].equals(ch)) ) return true;
        return false;
    }
}
