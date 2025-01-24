package UnitTesting;

import java.util.Random;

/**
 * A basic game that will leverage a few of the classes we build 
 * throughout the semester
 * 
 * @author William Goble
 */
public class Game {
    public static void main(String[] args) {
        Player player1;
        player1 = new Player("Frodo");

        player1.show();

        // generate a random value between 0 and 100 as a double
        Random r = new Random();
        double minValue = 0.0;
        double maxValue = 100.0;
        double attackValue = minValue + (maxValue - minValue) * r.nextDouble();

        // now let's attack Frodo and then let him take a long rest
        player1.takeDameage(attackValue);
        player1.show();
        player1.longRest();
        player1.show();
    }
}
