import java.util.Scanner;

// Main class to run the Tic-Tac-Toe game
public class TicTacToeEngine {

    public static void main(String[] args) {

        System.out.println("\nWelcome to Tic-Tac-Toe!\n");

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("\nEnter Player 1's name: ");

            String player1Name = scanner.next();

            System.out.print("Enter Player 2's name: ");

            String player2Name = scanner.next();

            GameLogic ticTacToe = new TicTacToeGame(player1Name, player2Name);
            
            ticTacToe.playGame();

        }

    }
    
}





