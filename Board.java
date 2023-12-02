import java.util.ArrayList;

// Represents the Tic-Tac-Toe game board
public class Board {

    private char[][] gameBoard;// 2D array to store the game board

    private ArrayList<ArrayList<Integer>> wininRows; // Winning positions in rows

    private ArrayList<ArrayList<Integer>> wininColumns; // Winning positions in columns

    private ArrayList<ArrayList<Integer>> wininDiagonals; // Winning positions in diagonals

    // Constructor initializes the game board and winning positions
    public Board() {

        gameBoard = new char[3][3];

        initializeGameBoard();

        initializeWinnerCheck();



    }

    // Helper method to initialize the game board with empty spaces
    private void initializeGameBoard() {

            for (int x = 0; x < 3; x++) {

            for (int y = 0; y < 3; y++) {

                gameBoard[x][y] = ' ';

            }

        }

    }

    // Helper method to initialize winning positions in rows, columns, and diagonals
    private void initializeWinnerCheck() {

        wininRows = new ArrayList<>();

        wininColumns = new ArrayList<>();

        wininDiagonals = new ArrayList<>();

        for (int x = 0; x < 3; x++) {

            ArrayList<Integer> newRow = new ArrayList<>();

                for (int y = 0; y < 3; y++) {

                newRow.add(x * 3 + y);

            }

            wininRows.add(newRow);

        }


        for (int y = 0; y < 3; y++) {

            ArrayList<Integer> column = new ArrayList<>();

                for (int x = 0; x < 3; x++) {

                column.add(x * 3 + y);

            }

            wininColumns.add(column);

        }


        ArrayList<Integer> primaryDiagonal = new ArrayList<>();

        ArrayList<Integer> secondaryDiagonal = new ArrayList<>();

        for (int x = 0; x < 3; x++) {

            primaryDiagonal.add(x * 3 + x);

            secondaryDiagonal.add(x * 3 + (2 - x));

        }

        wininDiagonals.add(primaryDiagonal);

        wininDiagonals.add(secondaryDiagonal);

    }


    // Displays the current state of the game board
    public void displayGameBoard() {

        System.out.println("-------------");

            for (int x = 0; x < 3; x++) {

            System.out.print("| ");

            for (int y = 0; y < 3; y++) {

                System.out.print(gameBoard[x][y] + " | ");

            }

            System.out.println("\n-------------");

        }

    }

    // Checks if a move is valid at the specified row and column
    public boolean isMoveValid(int row, int col) {
        
        return row >= 0 && row < 3 && col >= 0 && col < 3 && gameBoard[row][col] == ' ';

    }

    // Makes a move by updating the game board with the player's symbol
    public void makeMove(int row, int col, char playerSymbol) {

        gameBoard[row][col] = playerSymbol;

    }

    // Checks if the current state of the board represents a win
    public boolean checkForWin() {

        return checkForHelp(wininRows) || checkForHelp(wininColumns) || checkForWinDiagonals();

    }


    // Helper method to check for a win based on given positions
    private boolean checkForHelp(ArrayList<ArrayList<Integer>> positions) {

        for (ArrayList<Integer> pos : positions) {

            char symbol = gameBoard[pos.get(0) / 3][pos.get(0) % 3];
         
            if (symbol != ' ') {

                boolean isMatch = pos.stream().allMatch(p -> gameBoard[p / 3][p % 3] == symbol);

                    if (isMatch) {

                    return true;
                    
                }

            }

        }

        return false;

    }

    
    // Helper method to check for a win in diagonals
    private boolean checkForWinDiagonals() {

        return checkForHelp(wininDiagonals);

    }

    // Checks if the game has ended in a draw
    public boolean checkForDraw() {

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
