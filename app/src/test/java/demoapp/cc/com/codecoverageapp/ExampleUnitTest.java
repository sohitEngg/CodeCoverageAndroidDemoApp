package demoapp.cc.com.codecoverageapp;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import demoapp.cc.com.codecoverageapp.Helper.TextHelper;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    private TextHelper helper = null;

    @Before
    public void setUp() throws Exception{
        helper = new TextHelper();
    }

    @After
    public void tearDown() throws Exception{
        helper = null;
    }

    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }


    @Test
    public void testGetLowText() {
        Assert.assertEquals(helper.getText(49), "low");
    }

    @Test
    public void testHighText() {
        Assert.assertEquals(helper.getText(70), "high");
    }
}