import org.apache.logging.log4j.core.util.Assert;
import org.junit.jupiter.api.*;
import org.junit.jupiter.engine.*;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;


public class diceTest {
    Dice theDice;

    @Test
    public void sixEdgesValues() {
        theDice = new Dice(6);
        for (int i = 0; i < 100; i++) {
            int result = theDice.roll();
            assertTrue(result >= 1);
            assertTrue(result <= 6);
        }
    }

    @Test
    public void eightEdgesValues() {
        theDice = new Dice(8);
        for (int i = 0; i < 100; i++) {
            int result = theDice.roll();
            assertTrue(result >= 1);
            assertTrue(result <= 8);
        }
    }

    @Test
    public void twelveEdgesValues() {
        theDice = new Dice(12);
        for (int i = 0; i < 100; i++) {
            int result = theDice.roll();
            assertTrue(result >= 1);
            assertTrue(result <= 12);
        }
    }

    @Test
    public void twentyEdgesValues() {
        theDice = new Dice(20);
        for (int i = 0; i < 100; i++) {
            int result = theDice.roll();
            assertTrue(result >= 1);
            assertTrue(result <= 20);
        }
    }


    @Test
    @DisplayName("Name is not null")
    public void nameTest(){

        Dice dice=new Dice(6);
        assertThrows(IllegalArgumentException.class, () -> {
            Player player = new Player(null, 1);
            player.setGameScore(dice.roll());
        });
    }


    @Test
    public void diceNumberOfSidesTest(){

        assertThrows(IllegalArgumentException.class, () -> {
            Dice dice1 = new Dice(5);
            dice1.roll();
        });
    }
}
