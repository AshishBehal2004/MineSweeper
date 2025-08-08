import java.util.Arrays;
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
        while (bomb_count < 10) {
            int rn_row = rn.nextInt(rows);
            int rn_column = rn.nextInt(column);
            Cell random_cell = board[rn_row][rn_column];
            int randomCell_grid = rn_row * rn_column;
            int boardSize = rows * column;

            //for handling the edge case where the grid is smaller than the number of bombs that need to be planted
            int[] uniqueGridLocation = new int [boardSize];
            for (int i = 0; i < uniqueGridLocation.length; i++){
                uniqueGridLocation[i] = i;
            }
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
//        Board gameboard = new Board();
//        gameboard.printBoard();
        int rows = 5;
        int column = 5;
        int boardSize = rows * column;
        int[] uniqueGridLocation = new int[boardSize];
        for (int i = 0; i < uniqueGridLocation.length; i++){
            uniqueGridLocation = new int[i];
            System.out.println(Arrays.toString(uniqueGridLocation));
        }
    }
}
