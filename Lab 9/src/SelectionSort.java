public class SelectionSort {
    public static void sort(Comparable[] arr) {
        for (int i = 0; i < arr.length - 1; ++i) {
            int minI = i;
            for (int j = i + 1; j < arr.length; ++j) {
                if (arr[minI].compareTo(arr[j]) > 0) {
                    minI = j;
                }
            }
            Comparable temp = arr[i];
            arr[i] = arr[minI];
            arr[minI] = temp;
        }
    }
}
