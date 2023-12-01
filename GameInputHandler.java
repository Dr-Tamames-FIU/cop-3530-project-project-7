import java.util.InputMismatchException;

import java.util.Scanner;

// Handles input for player moves
public class GameInputHandler {

    private static final Scanner scanner = new Scanner(System.in);

     // Gets the player's move input (row and column)
    public static int[] getPlayerMove(Player currentPlayer) {

        try {

            System.out.print(currentPlayer.getName() + ", enter your move (row and column): ");

            int row = scanner.nextInt() - 1;

            int col = scanner.nextInt() - 1;
            
            return new int[] { row, col };

        } 
        catch (InputMismatchException e) {

            System.out.println("Invalid input. Please enter numeric values.");

            scanner.nextLine(); // Consume the invalid input

            return getPlayerMove(currentPlayer); // Recursive call to try again
        }
    }
}
