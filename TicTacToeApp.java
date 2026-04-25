import java.util.Scanner;

/**
 * UC4 – Convert slot (1–9) to board index (row, column)
 */

public class TicTacToeApp {

    // Method to take user input
    public static int getUserSlotInput() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter slot number (1-9): ");
        return scanner.nextInt();
    }

    // Method to convert slot → row & column
    public static int[] convertSlotToIndex(int slot) {

        int row = (slot - 1) / 3;
        int col = (slot - 1) % 3;

        return new int[]{row, col};
    }

    public static void main(String[] args) {

        int slot = getUserSlotInput();

        int[] index = convertSlotToIndex(slot);

        System.out.println("Slot " + slot + " → Row: " + index[0] + ", Column: " + index[1]);
    }
}