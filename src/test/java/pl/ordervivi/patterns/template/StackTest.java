package pl.ordervivi.patterns.template;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StackTest {
    final int STACK_INT = 10;
    private Stack stack;

    @BeforeEach
    void setUpNewStack() {
        stack = new Stack();
        for (int i = 1; i <= STACK_INT; i++) {
            stack.push(i);
        }
    }

    @Test
    public void evenPredicateFilter() {
        final Stack filtered = stack.filter(i -> (i % 2 == 0));

        assertEquals(Integer.valueOf(10), filtered.pop());
        assertEquals(Integer.valueOf(8), filtered.pop());
        assertEquals(Integer.valueOf(6), filtered.pop());
        assertEquals(Integer.valueOf(4), filtered.pop());
        assertEquals(Integer.valueOf(2), filtered.pop());
    }

    @Test
    public void allPredicateFilter() {
        final Stack filtered = stack.filter(new StackPredicate() {
            @Override
            public boolean isValid(int i) {
                return true;
            }
        });

        assertEquals(Integer.valueOf(10), filtered.pop());
        assertEquals(Integer.valueOf(9), filtered.pop());
        assertEquals(Integer.valueOf(8), filtered.pop());
        assertEquals(Integer.valueOf(7), filtered.pop());
        assertEquals(Integer.valueOf(6), filtered.pop());
        assertEquals(Integer.valueOf(5), filtered.pop());
        assertEquals(Integer.valueOf(4), filtered.pop());
        assertEquals(Integer.valueOf(3), filtered.pop());
        assertEquals(Integer.valueOf(2), filtered.pop());
        assertEquals(Integer.valueOf(1), filtered.pop());

    }
}

