package Characters;

public class Player extends Health{

    private String playerName;
    private String playerModel;

    public Player() {
    }

    public Player(String playerName, int health, String playerModel) {
        super(health);
        this.playerName = playerName;
        this.playerModel = playerModel;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerModel() {
        return playerModel;
    }

    public void setPlayerModel(String playerModel) {
        this.playerModel = playerModel;
    }
}
