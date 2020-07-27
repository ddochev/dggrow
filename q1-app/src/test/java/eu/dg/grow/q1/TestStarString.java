package eu.dg.grow.q1;

import eu.dg.grow.q1.power.StarString;
import eu.dg.grow.q1.power.StarStringImpl;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by doki on 7/26/20.
 */

public class TestStarString {

    @Test
    public void testStarString(){

        StarString ss = new StarStringImpl();

        Assert.assertEquals(1, ss.starString(0).length());
        Assert.assertEquals(16, ss.starString(4).length());
        Assert.assertEquals(256, ss.starString(8).length());

    }

}
