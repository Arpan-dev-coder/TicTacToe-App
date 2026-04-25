import java.util.Scanner;

/**
 * UC3 – Accept user slot input (1–9)
 */

public class TicTacToeApp {

    // Method to take slot input
    public static int getUserSlotInput() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter slot number (1-9): ");
        int slot = scanner.nextInt();

        return slot;
    }

    public static void main(String[] args) {

        int selectedSlot = getUserSlotInput();

        System.out.println("You selected slot: " + selectedSlot);
    }
}