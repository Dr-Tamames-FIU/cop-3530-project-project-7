import java.util.Scanner;



public class TicTacToeGame {

    private Board board;

    private Player currentPlayer;

    private Result result;

    public TicTacToeGame() {

        board = new Board();

        currentPlayer = new Player('X');

        result = new Result("");

    }

    public void playGame() {

        // Main game loop
        while (true) {

            board.displayGameBoard();

            makeMove();

            if (board.checkForWin()) {

                board.displayGameBoard();

                result = new Result("Player " + currentPlayer.getSymbol() + " wins!");

                result.displayResult();

                break;

            } else if (board.checkForDraw()) {

                board.displayGameBoard();

                result = new Result("It's a draw!");

                result.displayResult();

                break;

            }

            switchPlayers();

        }

    }

    private void makeMove() {

        Scanner scanner = new Scanner(System.in);

        int inputRow, inputCol;

        while (true) {

            System.out.print("Player " + currentPlayer.getSymbol() + ", enter your move (row and column): ");

            inputRow = scanner.nextInt();

            inputCol = scanner.nextInt();


            inputRow = inputRow - 1;
            
            inputCol = inputCol - 1;

            if (board.isMoveValid(inputRow, inputCol)) {

                board.makeMove(inputRow, inputCol, currentPlayer.getSymbol());

                break;

            } else {

                System.out.println("Invalid move. Please try again.");

            }

        }



    }

    private void switchPlayers() {

        currentPlayer.switchSymbol();

    }

}