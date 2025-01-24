package UnitTesting;

import static org.junit.Assert.*;
import org.junit.Test;

public class PlayerTest {
    @Test
    public void testConstructor()  {
        Player player1 = new Player("Margaret");

        assertEquals("Margaret", player1.getName());
        assertEquals(100.0, player1.getHealth(), 0.001);
    }

    @Test
    public void testTakeDamage() {
        Player player1 = new Player("Margaret");
        player1.takeDameage(2);

        assertEquals(98.0, player1.getHealth(), 0.0001);
    }
}
