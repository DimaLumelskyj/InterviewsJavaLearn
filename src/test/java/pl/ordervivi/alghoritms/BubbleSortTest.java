package pl.ordervivi.alghoritms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class BubbleSortTest {
    @Test
    public void bubbleSortIntArrayTest() {
        int[] array = {1, 4, 5, -2};
        BubbleSort.bubbleSortAsc(array);

    }

    @Test
    public void bubbleSortEx1TestSuccess() {
        int[] numbers = new int[]{1, 7, 99, 2, 0, 12, 15};
        BubbleSort.bubbleSortAsc(numbers);

        assertArrayEquals(new int[]{0, 1, 2, 7, 12, 15, 99}, numbers);
    }

    @Test
    public void bubbleSortEx2TestSuccess() {
        int[] numbers = new int[]{8, 5, 3, 1, 9, 6, 0, 7, 4, 2, 5};
        BubbleSort.bubbleSortAsc(numbers);

        assertArrayEquals(new int[]{0, 1, 2, 3, 4, 5, 5, 6, 7, 8, 9}, numbers);
    }

    @Test
    public void bubbleSortEx3TestSuccess() {
        int[] numbers = new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        BubbleSort.bubbleSortAsc(numbers);

        assertArrayEquals(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, numbers);
    }
}