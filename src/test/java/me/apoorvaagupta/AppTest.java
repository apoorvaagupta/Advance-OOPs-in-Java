package me.apoorvaagupta;

import org.junit.*;

import static org.junit.Assert.assertEquals;

public class AppTest {

    Integer v1 = 21;
    Integer v2 = 34;

    AdditionProcessor<Integer> api = new AdditionProcessor<Integer>(Integer.class);

    @Test
    public void testAddProcessorforInteger() {
        assertEquals(new Integer(55), api.process(v1, v2));
    }

    AdditionProcessor<String> aps = new AdditionProcessor<String>(String.class);

    @Test
    public void testAddProcessorforString() {
        assertEquals(("abcdef"), aps.process("abc", "def"));
    }

    ReversalProcessor<Integer> rpi = new ReversalProcessor<Integer>(Integer.class);

    @Test
    public void testRevProcessorforInteger() {
        assertEquals(new Integer(12), rpi.process(v1));
    }

    ReversalProcessor<String> rps = new ReversalProcessor<String>(String.class);

    @Test
    public void testRevProcessorforString() {
        assertEquals(("cba"), rps.process("abc"));
    }




}
