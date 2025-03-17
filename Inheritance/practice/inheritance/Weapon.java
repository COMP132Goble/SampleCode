package Inheritance.practice.inheritance;

import java.util.Random;

public class Weapon {
    protected String name;
    protected int dice;

    public Weapon(String name, int dice) {
        this.name = name;
        this.dice = dice;
    }

    public int attack() {
        Random number = new Random();
        int attack = number.nextInt(dice) + 1;
        return attack;
    }
}
