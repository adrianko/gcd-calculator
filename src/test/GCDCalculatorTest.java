package test;

import main.GCDCalculator;

import static org.junit.Assert.*;

public class GCDCalculatorTest {

    @org.junit.Test
    public void testCalculateNormal() throws Exception {
        long exp = 43L;
        long act = GCDCalculator.calculate(225277L, 178794L);
        assertEquals(exp, act);
    }

    @org.junit.Test
    public void testCalculateEqual() throws Exception {
        long exp = 225L;
        long act = GCDCalculator.calculate(225L, 225L);
        assertEquals(exp, act);
    }

    @org.junit.Test
    public void testCalculateExtreme() throws Exception {
        long exp = 1L;
        long act = GCDCalculator.calculate(4L, 9L);
        assertEquals(exp, act);
    }

    @org.junit.Test
    public void testCalculateSwapped() throws Exception {
        long exp = 43L;
        long act = GCDCalculator.calculate(178794L, 225277L);
        assertEquals(exp, act);
    }
    
}