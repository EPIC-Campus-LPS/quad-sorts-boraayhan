public static class QuadSorts {
    public QuadSorts() {

    }

    public static int[] bubbleSort(int[] a) {
        int c = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = temp;
                    c++;
                }
            }
            if (c == 0) return a;
        }
        return a;
    }

    public static int[] selectionSort(int[] a) {

        for (int i = 0; i < a.length - 1; i++) {
            int i_min = i;
            for (int j = i; j < a.length; j++) {
                if (a[i_min] > a[j]) {
                    i_min = j;
                }
            }
            int temp = a[i];
            a[i] = a[i_min];
            a[i_min] = temp;
        }
        return a;
    }

    public static int[] insertionSort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int i1 = a[i];

            int i2 = i - 1;
            while (i2 >= 0 && i1 < a[i2]) // Short-circuiting to avoid false index lookup
            {
                a[i2 + 1] = a[i2];
                i2--;
            }
            a[i2 + 1] = i1;
        }
        return a;
    }

    public static int[] mergeSort(int[] a) {
        return (mergeSortHelper(a, 0, a.length - 1));
    }

    public static int[] mergeSortHelper(int[] a, int start, int end) { // to keep formatting clean
        if (start >= end) return a;
        int c = (start + end) / 2;
        mergeSortHelper(a, c + 1, end);
        mergeSortHelper(a, start, c);
        recursiveMerge(a, start, c, end);
        return a;
    }

    public static void recursiveMerge(int[] a, int start, int c, int end) {
        int l_r = end - c;
        int l_l = c - start + 1;
        int[] right = new int[l_r];
        int[] left = new int[l_l];
        System.arraycopy(a, c + 1, right, 0, l_r);
        // thanks to miguelf23 on Quora for
        // showing me this efficient Java function
        System.arraycopy(a, start, left, 0, l_l);
        int rIndex = 0, lIndex = 0;
        int pos = start;
        while (lIndex < l_l && rIndex < l_r) {
            if (right[rIndex] < left[lIndex]) {
                a[pos] = right[rIndex];
                pos++;
                rIndex++;
            } else {
                a[pos] = left[lIndex];
                pos++;
                lIndex++;
            }
        }
        while (rIndex < l_r) {
            a[pos] = right[rIndex];
            pos++;
            rIndex++;
        }
        while (lIndex < l_l) {
            a[pos] = left[lIndex];
            pos++;
            lIndex++;
        }
    }

}

public static void main(String[] args) {
    int[] inp = {9252, 2521, 2, 7, 14, 25, 215, 15, 25, 2, 52, 2, 5, 252, 56, 35, 63, 63};
    System.out.println(Arrays.toString(QuadSorts.mergeSort(inp)));
}