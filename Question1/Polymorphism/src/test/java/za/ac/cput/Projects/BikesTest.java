package za.ac.cput.Projects;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.After;

public class BikesTest {
    private Bikes bikes;

    public static void main(String[] args){

        Vehicle vhc = new Bikes();
        // prints Bikes can move and accelerate too!!
        vhc.move();

        vhc=new Vehicle();
        // prints Vehicles can move!!
        vhc.move();
    }

    @Before
    public void setUp() throws Exception{
        bikes = new Bikes();
    }

    @After
    public void tearDown() throws Exception{
    }

    @Test
    public void move()
    {
        bikes.move();
        Assert.assertNotNull(bikes.toString());
    }
}