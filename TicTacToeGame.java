import java.util.Scanner;



public class TicTacToeGame {
 
    private char[][] gameBoard;

    private char currentPlayer;
 
    public TicTacToeGame() {
        
        gameBoard = new char[3][3];

        currentPlayer = 'X'; 

        initializegameBoard();

    }
 
    private void initializegameBoard() {

        
        for (int i = 0; i < 3; i++) {

        for (int j = 0; j < 3; j++) {

            gameBoard[i][j] = ' ';

            }

        }

    }

    public void playGame() {

        // Main game loop

        while (true) {

            displayGamegameBoard();

            makeMove();

            
            // Check for win or draw conditions

            if (checkForWin()) {

                displayGamegameBoard();

                System.out.println("Player " + currentPlayer + " wins!");

                break;

            } else if (checkForDraw()) {

                displayGamegameBoard();

                System.out.println("It's a draw!");

                break;

            }
 
            // Switches to the next player
            switchPlayers();

        }

    }
 
    private void displayGamegameBoard() {

        
        System.out.println("-------------");

            for (int i = 0; i < 3; i++) {

                System.out.print("| ");

            for (int j = 0; j < 3; j++) {

                System.out.print(gameBoard[i][j] + " | ");

            }

                System.out.println("\n-------------");

        }

    }

    private void makeMove() {

        // Gets the player's input and updates the game gameBoard

        Scanner scanner = new Scanner(System.in);

        int inputRow, inputCol;
 
        while (true) {

            System.out.print("Player " + currentPlayer + ", enter your move (row and column): ");

            inputRow = scanner.nextInt();

            inputCol = scanner.nextInt();
 
            if (isMoveValid(inputRow, inputCol)) {

                gameBoard[inputRow][inputCol] = currentPlayer;

                break;

            } else {

                System.out.println("Invalid move. Please try again.");

            }

        }

        scanner.close();

    }
 
    private boolean isMoveValid(int row, int col) {

        // Check if the selected move is valid

        return row >= 0 && row < 3 && col >= 0 && col < 3 && gameBoard[row][col] == ' ';

    }
 
    private void switchPlayers() {

        // Switches to the next player

        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';

    }


    private boolean checkForWin() {

        return checkForWinColumns() || checkForWinDiagonals();

    }

    private boolean checkForWinColumns() {

        for (int column = 0; column < 3; column++) {
 
            if (gameBoard[0][column] != ' ' && gameBoard[0][column] == gameBoard[1][column] && gameBoard[1][column] == gameBoard[2][column]) {
         
                return true;

            }

        }

        return false;
        
    }

    private boolean checkForWinDiagonals() {

        if (gameBoard[0][0] != ' ' && gameBoard[0][0] == gameBoard[1][1] && gameBoard[1][1] == gameBoard[2][2]) {
            // If the top-left to bottom-right diagonal has the same value and is not empty, return true
            return true;

        }
         
        if (gameBoard[0][2] != ' ' && gameBoard[0][2] == gameBoard[1][1] && gameBoard[1][1] == gameBoard[2][0]) {
            // If the top-right to bottom-left diagonal has the same value and is not empty, return true
            return true;

        }
         
        // If no winning diagonal is found, return false
        return false;

    }

    private boolean checkForDraw() {

         // Check if the gameBoard is full (no empty spaces)

            for (int row = 0; row < 3; row++) {
 
            for (int col = 0; col < 3; col++) {
     
                if (gameBoard[row][col] == ' ') {
     
                    return false; // Found an empty space, the game is not a draw

            }

        }

    }

    return true; // All spaces are filled, the game is a draw

    }

}