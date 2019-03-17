package za.ac.cput.Projects;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;

public class BuilderTest {
    RadioPresenter rp = new RadioPresenter();
    String walk,talk;

    @Before
    public void setUp() throws Exception {
        walk = "I love to walk to work";
       // talk = null;
    }

    @Test
    public void canWalk(){
        Assert.assertEquals(walk, rp.canWalk("walk on man"));
        Assert.assertNotSame(walk, rp.canWalk("walk"));
        }

//    @Test
//    public void canTalk(){
//        Assert.assertEquals(talk,null);
//    }

}