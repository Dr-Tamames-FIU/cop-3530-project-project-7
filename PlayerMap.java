import java.util.HashMap;
import java.util.Map;


	public class PlayerMap {
 
    private Map<String, Player> gamePlayers;
 
    public PlayerMap() {

        gamePlayers = new HashMap<>();

    }
 
    
    public void addPlayerToGame(String playerName, char playerSymbol) {

        Player gamePlayer = new Player(playerName, playerSymbol);

        gamePlayers.put(playerName, gamePlayer);

    }
 
    
    public Player getPlayerFromGame(String playerName) {

        return gamePlayers.get(playerName);

    }
    
}
