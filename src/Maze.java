public abstract class Maze {
    private int width = 20;
    private int height = 20;
    char[][] board;

    public Maze(int width, int height){
        this.width = width;
        this.height = height;
        board = new char[width][height];
    }

    protected void printMaze(){
        for (int x = 0; x < board[0].length; x++) {
            for (int y = 0; y < board.length; y++) {
                System.out.println(board[x][y]);
            }
            System.out.println();
        }
    }

    protected void cleanMaze(){
        for (int x = 0; x < board[0].length; x++) {
            for (int y = 0; y < board.length; y++) {
//                board[x][y] = ■;
            }
        }
    }
}
