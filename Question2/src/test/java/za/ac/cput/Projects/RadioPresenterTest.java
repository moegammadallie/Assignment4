package za.ac.cput.Projects;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RadioPresenterTest {

    RadioPresenter rp = new RadioPresenter();
    String walk,talk;

    @Before
    public void setUp() throws Exception {
            walk = null;
            talk = "My job is to talk talk";
    }

    @Test
    public void canWalk(){
        Assert.assertEquals(walk,null);
    }
    @Test
    public void canTalk(){
        Assert.assertEquals(talk,rp.canTalk("talk"));
        Assert.assertNotSame(talk,rp.canTalk("talk"));
    }
}