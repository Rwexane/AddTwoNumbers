import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddTwoNumbersTest
{
    AddTwoNumbers addNum1 = new AddTwoNumbers();

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void addNum() throws Exception
    {
        //assertEquals(10.5f,addNum1.addNum(),0.0);
        assertEquals(10.5f,addNum1.addNum(),0.0);
    }
}