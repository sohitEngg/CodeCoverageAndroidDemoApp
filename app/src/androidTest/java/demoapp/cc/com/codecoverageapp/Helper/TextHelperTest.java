package demoapp.cc.com.codecoverageapp.Helper;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TextHelperTest {

    private TextHelper helper = null;

    @Before
    public void setUp() throws Exception{
        helper = TextHelper.getInstance();
    }

    @After
    public void tearDown() throws Exception{
        helper = null;
    }

    @Test
    public void testGetText() {
        Assert.assertEquals(helper.getText(49), "low");
    }
}