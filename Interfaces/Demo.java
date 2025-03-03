package Interfaces;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        MakesSound sound = new Duck("Mallard");
        sound.makeSound();
        // Game();
    }

    public static void Game() {
        Player[] game = new Player[3];
        game[0] = new Player("Frodo");
        game[1] = new Player("Sam");
        game[2] = new Player("Pippin");

        for (int i = 0; i < game.length; i++) {
            game[i].setAttackOrder();
        }

        System.out.println("Before Sorting");
        for (int i = 0; i < game.length; i++) {
            System.out.println(game[i].getName() + " " + game[i].attackOrder);
        }

        Arrays.sort(game);

        System.out.println("After Sorting");
        for (int i = 0; i < game.length; i++) {
            System.out.println(game[i].getName() + " " + game[i].attackOrder);
        }
    }
}
