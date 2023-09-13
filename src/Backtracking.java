public class Backtracking {

    public static boolean ratInMaze(int [][] maze){
        int n = maze.length;
        int [][] path = new int[n][n];
        return solveMaze(maze,0,0,path);
    }
    public static boolean solveMaze(int[][] maze,int i, int j, int[][] path){
        //check i and j cell is valid or not?

        int n = maze.length;
        if (i<0 || i>=n || j<0 || j>=n || maze[i][j]==0 || path[i][j] == 1){
            return false;
        }

        //include the cell in current path
        path[i][j] = 1;

        //check for destination cell
        if (i==n-1 && j==n-1){

            for (int r = 0;r<n;r++){
                for (int c = 0;c<n;c++){
                    if(path[r][c]==0){
                        System.out.print(" ");
                    }else {
                        System.out.print(path[r][c] + " ");}
                }
                System.out.println();
            }
            return true;
        }

        //Explore in all directions
        //top
        if (solveMaze(maze,i-1,j,path)){
            return true;
        }
        // right
        if (solveMaze(maze,i,j+1,path)){
            return true;
        }
        //left
        if (solveMaze(maze,i,j-1,path)){
            return true;
        }
        //down
        if (solveMaze(maze,i+1,j,path)){
            return true;
        }
        return false;
    }

    public static void placeNQueens(int n){
        int[][] board = new int[n][n];
        placeQueen(board,0,n);
    }

    private static void placeQueen(int[][] board,int row,int n) {
        if(row == n){
            for(int i = 0;i<n;i++){
                for(int j = 0;j<n;j++){
                    System.out.print(board[i][j] + " ");
                }System.out.println();
            }

        }
        for(int j = 0;j<n;j++){
            if(isBoardSafe(board,row,j)){
                board[row][j] = 1;
                placeQueen(board,row+1,n);
                board[row][j]=0;
            }
        }

    }

    private static boolean isBoardSafe(int[][] board, int row, int col) {
        int n = board.length;
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }
        for(int i = row + 1,j = col+1;i<n && j<n;i++,j++){
            if(board[i][j] == 1){
                return false;
            }
        }
        for(int i = row - 1,j = col+1;i>=0 && j<n;i--,j++){
            if(board[i][j] == 1){
                return false;
            }
        }
        for(int i = row + 1,j = col-1;i<n && j>=0;i++,j--){
            if(board[i][j] == 1){
                return false;
            }
        }
        for(int i = row - 1;i>=0;i--){
            if(board[i][col] == 1){
                return false;
            }
        }
        for(int i = row + 1;i < n; i++){
            if(board[i][col] == 1){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
//        int [][] maze = {{1,1,0},{1,0,1},{1,1,1}};
//        boolean pathPossible = ratInMaze(maze);
//        System.out.println(pathPossible);
        placeNQueens(4);

    }
}
