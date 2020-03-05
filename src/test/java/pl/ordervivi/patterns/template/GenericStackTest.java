package pl.ordervivi.patterns.template;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class GenericStackTest {
    final int STACK_INT = 10;
    private GenericStack<Integer> stack;

    public static GenericStack<A> pushAllAObjects(final List<A> listOfA) {
        final GenericStack<A> stack = new GenericStack<>();
        for (A a : listOfA) {
            stack.push(a);
        }
        return stack;
    }

    @BeforeEach
    void setUpNewStack() {
        stack = new GenericStack<Integer>();
        for (int i = 1; i <= STACK_INT; i++) {
            stack.push(i);
        }
    }

    @Test
    public void evenPredicateFilter() {
        final GenericStack<Integer> filtered = stack.filter(new StackPredicateGeneric<Integer>() {
            @Override
            public boolean isValid(Integer i) {
                return i % 2 == 0;
            }
        });

        assertEquals(Integer.valueOf(10), filtered.pop().get());
        assertEquals(Integer.valueOf(8), filtered.pop().get());
        assertEquals(6, filtered.pop().get());
        assertEquals(4, filtered.pop().get());
        assertEquals(2, filtered.pop().get());
    }

    @Test
    public void allPredicateFilter() {
        final GenericStack<Integer> filtered = stack.filter(new StackPredicateGeneric<Integer>() {
            @Override
            public boolean isValid(Integer object) {
                return true;
            }
        });

        assertEquals(Integer.valueOf(10), filtered.pop().get());
        assertEquals(Integer.valueOf(9), filtered.pop().get());
        assertEquals(Integer.valueOf(8), filtered.pop().get());
        assertEquals(Integer.valueOf(7), filtered.pop().get());
        assertEquals(Integer.valueOf(6), filtered.pop().get());
        assertEquals(Integer.valueOf(5), filtered.pop().get());
        assertEquals(Integer.valueOf(4), filtered.pop().get());
        assertEquals(Integer.valueOf(3), filtered.pop().get());
        assertEquals(Integer.valueOf(2), filtered.pop().get());
        assertEquals(Integer.valueOf(1), filtered.pop().get());
    }

    @Test
    public void usePushAllA() {
        final ArrayList<A> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new A());
        }

        final GenericStack<A> genericStack = pushAllAObjects(list);
        assertNotNull(genericStack.pop());
    }

    class A {
    }

    class B extends A {
    }


}