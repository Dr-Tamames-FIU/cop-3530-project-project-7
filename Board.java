public class Board {

    private char[][] gameBoard;

    public Board() {

        gameBoard = new char[3][3];

        initializeGameBoard();

    }

    private void initializeGameBoard() {

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                gameBoard[i][j] = ' ';

            }

        }

    }

    public void displayGameBoard() {

        System.out.println("-------------");

        for (int i = 0; i < 3; i++) {

            System.out.print("| ");

            for (int j = 0; j < 3; j++) {

                System.out.print(gameBoard[i][j] + " | ");

            }

            System.out.println("\n-------------");

        }

    }

    public boolean isMoveValid(int row, int col) {
        return row >= 0 && row < 3 && col >= 0 && col < 3 && gameBoard[row][col] == ' ';
    }

    public void makeMove(int row, int col, char playerSymbol) {

        gameBoard[row][col] = playerSymbol;

    }

    public boolean checkForWin() {

        return checkForWinColumns() || checkForWinDiagonals();

    }

    private boolean checkForWinColumns() {

        for (int col = 0; col < 3; col++) {

            if (gameBoard[0][col] != ' ' &&

                gameBoard[0][col] == gameBoard[1][col] &&

                gameBoard[1][col] == gameBoard[2][col]) {

                return true;

            }

        }

        return false;

    }

    private boolean checkForWinDiagonals() {

        if (gameBoard[0][0] != ' ' &&
        gameBoard[0][0] == gameBoard[1][1] &&
        gameBoard[1][1] == gameBoard[2][2]) {
        // If the diagonal from top-left to bottom-right has the same value and is not empty, return true
        return true;
    }
 
    if (gameBoard[0][2] != ' ' &&
        gameBoard[0][2] == gameBoard[1][1] &&
        gameBoard[1][1] == gameBoard[2][0]) {
        // If the diagonal from top-right to bottom-left has the same value and is not empty, return true
        return true;
    }
 
    // If no winning diagonal is found, return false
    return false;
    
}

    

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
