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

    private static int[] mergeSortHelper(int[] a, int start, int end) { // to keep formatting clean
        if (start >= end) return a;
        int c = (start + end) / 2;
        mergeSortHelper(a, c + 1, end);
        mergeSortHelper(a, start, c);
        recursiveMerge(a, start, c, end);
        return a;
    }

    private static void recursiveMerge(int[] a, int start, int c, int end) {
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

    static int[] randomArr(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = (int)(Math.random() * n);
        return a;
    }

}

public static void main(String[] args) {
    int[] testCases = {100, 1000, 10000, 100000, 1000000};
    for (int n : testCases) {
        int[] inp = QuadSorts.randomArr(n);
        double t1 = System.currentTimeMillis();
        QuadSorts.bubbleSort(inp);
        System.out.println(String.valueOf(System.currentTimeMillis() - t1) + " miliseconds for BubbleSort with " + n + " test cases.");
    }
    for (int n : testCases) {
        int[] inp = QuadSorts.randomArr(n);
        double t1 = System.currentTimeMillis();
        QuadSorts.mergeSort(inp);
        System.out.println(String.valueOf(System.currentTimeMillis() - t1) + " miliseconds for MergeSort with " + n + " test cases.");
    }
    for (int n : testCases) {
        int[] inp = QuadSorts.randomArr(n);
        double t1 = System.currentTimeMillis();
        QuadSorts.insertionSort(inp);
        System.out.println(String.valueOf(System.currentTimeMillis() - t1) + " miliseconds for Insert Sort with " + n + " test cases.");
    }
    for (int n : testCases) {
        int[] inp = QuadSorts.randomArr(n);
        double t1 = System.currentTimeMillis();
        QuadSorts.selectionSort(inp);
        System.out.println(String.valueOf(System.currentTimeMillis() - t1) + " miliseconds for SelectionSort with " + n + " test cases.");
    }
}