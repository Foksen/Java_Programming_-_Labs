public class MergeSort {
    public static void sort(Comparable[] arr) {
        if (arr == null)
            return;
        if (arr.length < 2)
            return;

        Comparable[] L = new Comparable[arr.length / 2];
        System.arraycopy(arr, 0, L, 0, L.length);
        Comparable[] R = new Comparable[arr.length - L.length];
        System.arraycopy(arr, L.length, R, 0, R.length);

        sort(L);
        sort(R);

        Comparable[] merged = merge(L, R);
        System.arraycopy(merged, 0, arr, 0, merged.length);
    }

    public static Comparable[] merge(Comparable[] a1, Comparable[] a2) {
        Comparable[] b = new Comparable[a1.length + a2.length];
        int positionA1 = 0;
        int positionA2 = 0;

        for(int i = 0; i < b.length; i++) {
            if(positionA1 == a1.length){
                b[i] = a2[positionA2];
                positionA2++;
            } else if(positionA2 == a2.length){
                b[i] = a1[positionA1];
                positionA1++;
            } else if(a1[positionA1].compareTo(a2[positionA2]) < 0){
                b[i] = a1[positionA1];
                positionA1++;
            } else {
                b[i] = a2[positionA2];
                positionA2++;
            }
        }
        return b;
    }
}
