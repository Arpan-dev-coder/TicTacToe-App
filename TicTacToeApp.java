import java.util.Scanner;

/**
 * UC5 – Validate user move
 */

public class TicTacToeApp {

    // Initialize board
    public static char[][] createBoard() {

        char[][] board = new char[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }

        return board;
    }

    // Convert slot → row, col
    public static int[] convertSlotToIndex(int slot) {

        int row = (slot - 1) / 3;
        int col = (slot - 1) % 3;

        return new int[]{row, col};
    }

    // Validate move
    public static boolean isValidMove(char[][] board, int row, int col) {

        // Check bounds
        if (row < 0 || row > 2 || col < 0 || col > 2) {
            return false;
        }

        // Check if cell is empty
        if (board[row][col] != '-') {
            return false;
        }

        return true;
    }

    // Print board
    public static void printBoard(char[][] board) {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        char[][] board = createBoard();

        printBoard(board);

        System.out.print("Enter slot (1-9): ");
        int slot = scanner.nextInt();

        int[] index = convertSlotToIndex(slot);

        int row = index[0];
        int col = index[1];

        // Validate move
        if (isValidMove(board, row, col)) {
            System.out.println("Valid move ✅");
        } else {
            System.out.println("Invalid move ❌");
        }
    }
}