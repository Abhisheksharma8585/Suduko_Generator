import java.util.ArrayList;
import java.util.Collections;

public class SudokuGenerator {
    private static int size = 9;
    private static int[][] board = new int[size][size];
    
    protected static  void generate_Suduko_Board() {
        fillBoard(0, 0);
        printBoard();
    }

    private static boolean fillBoard(int row, int col) {
        if(row == size) return true;

        int nextRow = (col == size - 1) ? row + 1 : row;
        int nextCol = (col == size - 1) ? 0 : col + 1;

        ArrayList<Integer> number = new ArrayList<>();
        for(int i = 1; i <= 9; i++) number.add(i);
        
        Collections.shuffle(number);

        for(int num : number) {
            if(isSafe(num, row, col)) {
                board[row][col] = num;
                if(fillBoard(nextRow, nextCol)) return true;
                board[row][col] = 0;
            }
        }

        return false;
    }

    private static boolean isSafe(int num, int row, int col) {

        for(int i = 0; i < 9; i++) {
            if(board[row][i] == num) return false;
            if(board[i][col] == num) return false;
        }

        int nRow = (row / 3) * 3;
        int nCol = (col / 3) * 3;

        for(int i = nRow; i < nRow + 3; i++) {
            for(int j = nCol; j < nCol + 3; j++) {
                if(board[i][j] == num) return false;
            }
        }
        return true;
    }

    private static  void printBoard() {
        String line = "-------------------------------------";
       
        for (int i = 0; i < 9; i++) {
            System.out.println(line);
            for (int j = 0; j < 9; j++) {
                System.out.print("| " + board[i][j] + " ");
            } 
            System.out.println("|");
        }
        System.out.println(line + "\n");

    }
}