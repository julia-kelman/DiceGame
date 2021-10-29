import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import java.util.Random;
import java.util.logging.SocketHandler;


public class Dice {

    public void setNumOfEdges(int numOfEdges) {
        this.numOfEdges = numOfEdges;
    }

    int numOfEdges;

    static int playerRolls;

    public int getNumOfEdges() {
        return numOfEdges;
    }

    public static int getPlayerRolls() {
        return playerRolls;
    }



    public  Dice (int numOfEdges) {
        if(numOfEdges==6||numOfEdges==8||numOfEdges==12||numOfEdges==20)
        {
            this.numOfEdges=numOfEdges;
            //Logger.info("Number of dice sides is: "+numOfEdges);
        }
       else{
           throw new IllegalArgumentException("error");
            //System.out.println("error");
        }
    }

        public int roll() {
            Random rn = new Random();
               playerRolls = rn.nextInt(numOfEdges) + 1;
               return playerRolls;
    }
}