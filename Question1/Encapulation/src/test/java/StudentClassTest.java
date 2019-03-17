import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentClassTest {
    private StudentClass stud;

    @Before
    public void setUp() throws Exception {
        stud = StudentClass.StudentMaker.newInstance()
                .setCourse("AppDev")
                .setYear_of_study(4).build();
    }

    @After
    public void tearDown() throws Exception {
    }


    @Test
    public void getCourse()
    {
        Assert.assertEquals(stud.getCourse(), "AppDev");
    }

    @Test
    public void getYear_of_study()
    {
        Assert.assertEquals(stud.getYear_of_study(), 4);
    }
}