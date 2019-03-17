package za.ac.cput.Projects;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ManTest {
    private String talk,walk;
    Man man = new Man();

    @Before
    public void setUp() throws Exception {
        walk = "I love to talk";
        talk = null;
    }

    @Test
    public void canWalk(){
        Assert.assertEquals(walk,man.canWalk("Walk"));
        Assert.assertNotSame(walk,man.canWalk("Walk"));
        }

        @Test
    public void canTalk() {
        Assert.assertEquals(talk,man.canTalk(null));
    }
}