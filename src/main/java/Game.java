import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Game {

    private static final Logger Logger= LogManager.getLogger(Game.class);

    int scorePlayer1;
    int scorePlayer2;

    public void  startGame () {

        Logger.info("Running method calculate");

        Player player1= new Player ("Moshe", 1);
        Player player2= new Player("Yossi", 2);

        Dice rollDice = new Dice(6);
        player1.setGameScore(rollDice.roll());
        player2.setGameScore(rollDice.roll());

        System.out.println(player1+ " "+ Dice.playerRolls);
        System.out.println(player2+ " "+ Dice.playerRolls);

        compareScore(player1, player2);

    }

    public void compareScore(Player player1, Player player2) {
        scorePlayer1 = player1.getGameScore();
        scorePlayer2 = player2.getGameScore();

        if (scorePlayer1==scorePlayer2) {
            System.out.println("Tied game with both players scoring "+ scorePlayer1);
            Logger.info("Player1 and Player2 scores are: "+scorePlayer1);
        }
        else {
            if (scorePlayer1 > scorePlayer2) {

                System.out.println("Player 1 wins with score "+scorePlayer1);
                System.out.println("Player 2 looses with score"+scorePlayer2 );
                System.out.println(player1.getPlayer()+" Is the winner");
                Logger.info("Player1 wins with score: "+scorePlayer1);

            } else {
                System.out.println("Player 2 wins with score "+scorePlayer2 );
                System.out.println("Player 1 looses with score"+scorePlayer1);
                Logger.info("Player2 wins with score: "+scorePlayer2);
            }
        }
    }
}
