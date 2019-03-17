package za.ac.cput.Projects;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WomanTest {
    private String talk,walk;
    Woman woman = new Woman();

    @Before
    public void setUp() throws Exception {
        walk = null;
        talk = "I love to talk";
    }

    @Test
    public void canWalk() {
        assertEquals(walk,woman.canWalk(null));
    }

    @Test
    public void canTalk() {
        assertEquals(talk,woman.canTalk("talk"));
        assertNotSame(talk,woman.canTalk("talk"));
    }
}