package za.ac.cput.Projects;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UnderGraduateTest {
    private Student stud;

    @Before
    public void setUp() throws Exception {
        stud = new Student();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void welcome() {
    }

    @Test
    public void getStudent_no() {
        Assert.assertEquals(stud.getStudent_no(), "209135816");
    }

    @Test
    public void getCourse() {
        Assert.assertEquals(stud.getCourse(), "AppDev");
    }

    @Test
    public void getName() {
        Assert.assertEquals(stud.getName(), "Moegammad");
    }

    @Test
    public void getNo_of_years_studied() {
        Assert.assertEquals(stud.getNo_of_years_studied(), 3);
    }

}