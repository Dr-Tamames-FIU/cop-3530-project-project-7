// Represents the result of a Tic-Tac-Toe game

public class Result {

    private String result; // Game result message

    // Constructor initializes the result message
    public Result(String result) {

        this.result = result;

    }

    // Displays the game result
    public void displayResult() {

        System.out.println(result);

    }

}