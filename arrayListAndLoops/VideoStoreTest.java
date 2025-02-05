package arrayListAndLoops;

import static org.junit.Assert.*;
import org.junit.Test;


public class VideoStoreTest {
    @Test    
    public void removeDVDTest() {
        VideoStore myStore = new VideoStore("my video store");
        DVD movie1 = new DVD("The Wild Robot", "PG", 150, "Family");
        DVD movie2 = new DVD("Spider Man", "R", 150, "Superhero");
        DVD movie3 = new DVD("Heat", "R", 150, "Action");

        myStore.addDVD(movie1);
        myStore.addDVD(movie2);
        myStore.addDVD(movie3);

        assertEquals(3, myStore.getListSize());
        DVD target = myStore.getDVD(2);
        assertEquals("Heat", target.getTitle());
        myStore.removeDVD(2);
        assertEquals(2, myStore.getListSize());
        target = myStore.getDVD(2);
        assertNull(target);
    }
}
