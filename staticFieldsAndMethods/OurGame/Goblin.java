package staticFieldsAndMethods.OurGame;

import java.util.Random;

public class Goblin {
    private double health;
    private static int numGoblins = 0;

    public Goblin() {
        health = 100.0;
        numGoblins++;
    }

    public double attack() {
        Random r = new Random();
        double minValue, maxValue;
        
        if (numGoblins < 5) {
            minValue = 0.0;
            maxValue = 5.0;
        } else {
            minValue = 10.0;
            maxValue = 20.0;
        }

        double attackValue = minValue + (maxValue - minValue) * r.nextDouble();
        return attackValue;
    }

    public String toString() {
        return "A goblin is at " + health + "% health";
    }
}
