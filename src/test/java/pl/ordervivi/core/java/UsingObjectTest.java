package pl.ordervivi.core.java;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class UsingObjectTest {
    @Test
    public void expectNullPointerExceptionThrown() {
        final String string = null;
        AtomicInteger stringLength = new AtomicInteger();
        assertThrows(NullPointerException.class, () -> stringLength.set(string.length()));
    }

    @Test
    public void objectMemoryAssignment() {
        List<String> list = new ArrayList<>();
        list.add("element in list");
        assertEquals(1, list.size());
        List<String> listNext = list;
        listNext.add("entry in listNext");
        assertEquals(2, list.size());
    }

    @Test
    public void finalReferenceChange() {
        final int i = 142;
        final List<String> list = new ArrayList<>(25);
        assertEquals(0, list.size());

        list.add("adding new value to a static list");
        assertEquals(1, list.size());

        list.clear();
        assertEquals(0, list.size());
    }


}
