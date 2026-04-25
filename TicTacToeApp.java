import java.util.Random;

/**
 * UC2 – Toss to decide first player and assign symbols
 */

public class TicTacToeApp {

    public static void main(String[] args) {

        // Create random object
        Random random = new Random();

        // Toss (0 or 1)
        int toss = random.nextInt(2);

        String player1 = "Player 1";
        String player2 = "Player 2";

        char player1Symbol;
        char player2Symbol;
        String currentPlayer;

        // Conditional logic
        if (toss == 0) {
            currentPlayer = player1;
            player1Symbol = 'X';
            player2Symbol = 'O';
        } else {
            currentPlayer = player2;
            player2Symbol = 'X';
            player1Symbol = 'O';
        }

        // Display results
        System.out.println("Toss Result: " + toss);
        System.out.println(currentPlayer + " starts first!");
        System.out.println(player1 + " symbol: " + player1Symbol);
        System.out.println(player2 + " symbol: " + player2Symbol);
    }
}