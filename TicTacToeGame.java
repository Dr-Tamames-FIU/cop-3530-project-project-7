import java.util.Scanner;

// Implements the game logic for Tic-Tac-Toe
public class TicTacToeGame implements GameLogic {

    private Board board; // Game board

    private PlayerMap PlayerMap; //Map player names to their corresponding symbols

    private String player1Name; //Player1's Name

    private String player2Name; //Player2's Name

    private Player currentPlayer;  // Current player

    private Result result;  // Game result

    private Scanner scanner; // Scanner for input

    // Constructor initializes the game with player names
    public TicTacToeGame(String player1Name, String player2Name) {

        this.player1Name = player1Name;

        this.player2Name = player2Name;

        board = new Board();

        PlayerMap = new PlayerMap();

        PlayerMap.addPlayerToGame(player1Name, 'X');

        PlayerMap.addPlayerToGame(player2Name, 'O');

        currentPlayer = PlayerMap.getPlayerFromGame(player1Name);

        result = new Result("");

        scanner = new Scanner(System.in);

    }

    // Implements the main game loop and controls the game flow
    public void playGame() {

        while (true) {

            board.displayGameBoard();

            makeMove();

            if (board.checkForWin()) {

                board.displayGameBoard();

                result = new Result(currentPlayer.getName() + " wins!");

                result.displayResult();

                break;

            } 

            else if (board.checkForDraw()) 

            {
                board.displayGameBoard();

                result = new Result("It's a draw!");

                result.displayResult();

                break;

            }

            switchPlayers();
        }

        if (askForReplay()) {

            board = new Board();

            playGame();

        }

        scanner.close();  // Close the Scanner when it's no longer needed
    }

    // Handles the process of making a move by a player
    private void makeMove() {

        int[] move = GameInputHandler.getPlayerMove(currentPlayer);

        int inputRow = move[0];

        int inputCol = move[1];

        if (board.isMoveValid(inputRow, inputCol)) {

            board.makeMove(inputRow, inputCol, currentPlayer.getSymbol());

        } 
        
        else
        
        {
            System.out.println("Invalid move. Please try again.");

            makeMove(); // Recursive call to try again
        }
    }

    // Switches the current player between player1 and player2
    private void switchPlayers() {

        currentPlayer = (currentPlayer == PlayerMap.getPlayerFromGame(player1Name)) ? PlayerMap.getPlayerFromGame(player2Name) : PlayerMap.getPlayerFromGame(player1Name);


    }

    // Asks the players if they want to replay the game
    private boolean askForReplay() {

        System.out.print("Do you want to play again? (yes/no): ");

        String response = scanner.next().toLowerCase();

        return response.equals("yes");
        
    }
    
    
}
