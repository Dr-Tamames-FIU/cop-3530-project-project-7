// Represents a player in the Tic-Tac-Toe game

public class Player {

    private String name;// Player's name

    private char symbol;// Player's symbol ('X' or 'O')

    // Constructor initializes the player with a name and symbol
    public Player(String name, char symbol) {

        this.name = name;

        this.symbol = symbol;
    }

    // Gets the player's symbol
    public char getSymbol() {

        return symbol;
    }

    // Gets the player's name
    public String getName() {

        return name;
    }

    // Switches the player's symbol between 'X' and 'O'
    public void switchSymbol() {
        
        symbol = (symbol == 'X') ? 'O' : 'X';
    }
}
