import java.util.Comparator;

public class QuickSort {
    public static <T> void sort(T[] array, Comparator<T> comp) {
        if (array.length == 0)
            return;
        innerSort(array, 0, array.length - 1, comp);
    }

    private static <T> void innerSort(T[] array, int l, int r, Comparator<T> comp) {
        if (l >= r)
            return;
        int m = l + (r - l) / 2;
        T mVal = array[m];
        int i = l, j = r;
        while (i <= j) {
            while (comp.compare(array[i], mVal) > 0)
                ++i;
            while (comp.compare(mVal, array[j]) > 0)
                --j;
            if (i <= j) {
                T temp = array[i];
                array[i++] = array[j];
                array[j--] = temp;
            }
        }
        if (l < j)
            innerSort(array, l, j, comp);
        if (r > i)
            innerSort(array, i, r, comp);
    }
}
