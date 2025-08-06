public class Cell {
    boolean mine;
    boolean isRevealed;
    int adjacent_mines;

    //creating a cell that will be part of the board
    Cell() {
        this.mine = false;
        this.isRevealed = false;
        this.adjacent_mines = 0;
    }

    //representing it as a "." for now
    public String Cell_reveal() {
        return ".";
    }


}

