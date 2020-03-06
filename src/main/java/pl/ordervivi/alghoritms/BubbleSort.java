package pl.ordervivi.alghoritms;

public class BubbleSort {
    public static void bubbleSortAsc(int[] array) {
        int length = array.length;
        int j;
        for (int i = 0; i < length; i++) {
            for (j = length - 1; j > i; j--) {
                if (array[j - 1] > array[j]) {
                    swapArray(j, j - 1, array);
                }
            }
        }
    }

    private static void swapArray(int i, int j, int[] array) {
        int tmp = array[j];
        array[j] = array[i];
        array[i] = tmp;
    }

}
