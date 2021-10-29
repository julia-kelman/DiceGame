import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Player {

    String player;

    int playerID;

    int gameScore;

    public  Player (String player,int playerID) {
        this.player=player;
        this.playerID=playerID;



        if (player == null || player.isEmpty() || player.isBlank()) {
            throw new IllegalArgumentException("error");
            //Logger.info("Error");

        }

        else{
            this.player=player;
            this.playerID=playerID;
        }
    }


    @Override
    public String toString() {
        return "Player{" +
                "player='" + player + '\'' +
                ", playerID=" + playerID +
                ", gameScore=" + gameScore +
                '}';
    }


    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public int getPlayerID() { return playerID; }

    public void setPlayerID(int playerID) {
        this.playerID = playerID;
    }

    public int getGameScore() {
        return gameScore;
    }

    public void setGameScore(int gameScore) {
        this.gameScore = gameScore;
    }

}
