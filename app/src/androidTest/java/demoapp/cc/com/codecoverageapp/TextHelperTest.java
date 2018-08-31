package demoapp.cc.com.codecoverageapp;

import android.support.test.runner.AndroidJUnit4;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import demoapp.cc.com.codecoverageapp.Helper.TextHelper;

import static org.junit.Assert.assertEquals;

@RunWith(AndroidJUnit4.class)
public class TextHelperTest {

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
    public void testGetText() {
        Assert.assertEquals(helper.getText(49), "low");
    }
}