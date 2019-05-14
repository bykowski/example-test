package pl.bykowski.exampletest;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AdderTest {

    @Test
    public void add() {
        Adder adder = new Adder();
        Assert.assertEquals(3, adder.add(1, 2));
        Assert.assertEquals(5, adder.add(3, 2));
        Assert.assertEquals(10, adder.add(5, 5));
        Assert.assertEquals(-5, adder.add(-15, 10));
    }
}