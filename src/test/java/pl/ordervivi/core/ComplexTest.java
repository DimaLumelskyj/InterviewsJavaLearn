package pl.ordervivi.core;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ComplexTest {

    @Test
    public void complexNumberAddition() {
        final Complex expected = new Complex(6, 2);

        final Complex a = new Complex(16, 0);
        final Complex b = new Complex(-10, 2);

        assertEquals(expected, a.add(b));
    }

}