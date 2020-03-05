package pl.ordervivi.core.java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class PrimitiveTypesTest {
    @Test
    public void absoluteOfMostNegativeInvValue() {
        final int mostNegative = Integer.MIN_VALUE;
        final int negated = Math.abs(mostNegative);
        assertFalse(negated > 0, "No positive equvivalent of Integer.MIN_VALUE");
    }
}
