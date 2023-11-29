import java.util.ArrayList;

public class Board {

    private char[][] gameBoard;

    private ArrayList<ArrayList<Integer>> wininRows;

    private ArrayList<ArrayList<Integer>> wininColumns;

    private ArrayList<ArrayList<Integer>> wininDiagonals;


    public Board() {

        gameBoard = new char[3][3];

        initializeGameBoard();

        initializeWinnerCheck();



    }

    private void initializeGameBoard() {

            for (int x = 0; x < 3; x++) {

            for (int y = 0; y < 3; y++) {

                gameBoard[x][y] = ' ';

            }

        }

    }

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


        for (int x = 0; x < 3; x++) {

            ArrayList<Integer> column = new ArrayList<>();

                for (int y = 0; y < 3; y++) {

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

    public boolean isMoveValid(int row, int col) {
        
        return row >= 0 && row < 3 && col >= 0 && col < 3 && gameBoard[row][col] == ' ';

    }

    public void makeMove(int row, int col, char playerSymbol) {

        gameBoard[row][col] = playerSymbol;

    }

    public boolean checkForWin() {

        return checkForHelp(wininRows) || checkForHelp(wininColumns) || checkForWinDiagonals();

    }



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

    

    private boolean checkForWinDiagonals() {

        return checkForHelp(wininDiagonals);

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
