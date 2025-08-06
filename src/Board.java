import java.util.Random;

public class Board {


    private int rows= 5;
    private int column = 5;
    private int num = 0;

    Cell[][] board;

    //initialising the grid
    Board() {
        this.rows = rows;
        this.column = column;
        this.board = new Cell[rows][column];

        for (int i =0;i<rows;i++) {
            for(int j=0;j<column;j++) {
                board[i][j] = new Cell();
            }
        }
    }

    //for now, just displaying the grid
    public void printBoard() {

        for (int i=0; i<rows;i++) {
            for (int j=0;j<column;j++) {

                System.out.print(board[i][j] +" ");
            }
            System.out.println();
        }
    }


    public String bomb() {
        return "💣";
    }

    public void plantBomb(){
        Random rn = new Random();
        int bomb_count = 0;
        while (bomb_count < 10){
            int rn_row =  rn.nextInt(rows);
            int rn_column =  rn.nextInt(column);
            Cell random_cell = board[rn_row][rn_column];
            if (random_cell.mine == true){
                continue;
            }
            else {
                random_cell.mine = true;
                bomb_count++;
            }

        }

    }
    public static void main(String[] args) {
        Board gameboard = new Board();
        gameboard.printBoard();


    }
}
