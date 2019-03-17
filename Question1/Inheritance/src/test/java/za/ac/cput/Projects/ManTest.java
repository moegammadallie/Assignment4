package za.ac.cput.Projects;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ManTest {

    private String move;
    Man man = new Man();
    @Before
    public void setUp() throws Exception {
        move = "I walk fast";
    }

    @Test
    public void canWalk() {
        assertEquals(move,man.canWalk("fast"));
        assertNotSame(move,man.canWalk("fast"));
    }

}