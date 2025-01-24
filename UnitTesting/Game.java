package UnitTesting;

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

        // create a monster and have it attack Frodo
        Monster monster;
        monster = new Monster();
        double attackValue = monster.smallAttack();
        // double attackValue = monster.bigAttack();
        
        // now let's attack Frodo and then let him take a long rest
        player1.takeDameage(attackValue);
        player1.show();
        player1.longRest();
        player1.show();
    }
}
