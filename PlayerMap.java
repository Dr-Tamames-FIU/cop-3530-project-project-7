import java.util.HashMap;

import java.util.Map;

// Shows how player names are mapped to player objects.
	public class PlayerMap {
 
    private Map<String, Player> gamePlayers;

 // The PlayerMap is initialized with an empty HashMap by the constructor.
    public PlayerMap() {

        gamePlayers = new HashMap<>();

    }
 
    // Inserts a new player with the specified name and symbol into the game.
    public void addPlayerToGame(String playerName, char playerSymbol) {

        Player gamePlayer = new Player(playerName, playerSymbol);

        gamePlayers.put(playerName, gamePlayer);

    }
 
    // Acquires the Player object linked to the given player identity
    public Player getPlayerFromGame(String playerName) {

        return gamePlayers.get(playerName);

    }

}
