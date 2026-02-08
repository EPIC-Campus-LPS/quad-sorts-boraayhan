// I spent about 30 minutes trying to figure out how to import Quadsorts.java into here, but
// kept running into random package errors.
// For the sake of my sanity and completing the assignment, I used a PSVM within Quadsorts.java


//public class QuadsortsTester {
//    public static void main(String[] args) {
//        int[] testCases = {100, 1000, 10000, 100000, 1000000};
//        for (int n : testCases) {
//            int[] inp = QuadSorts.randomArr(n);
//            double t1 = System.currentTimeMillis();
//            QuadSorts.bubbleSort(inp);
//            System.out.println(String.valueOf(System.currentTimeMillis() - t1) + " miliseconds for BubbleSort with " + n + " test cases.");
//        }
//        for (int n : testCases) {
//            int[] inp = QuadSorts.randomArr(n);
//            double t1 = System.currentTimeMillis();
//            QuadSorts.mergeSort(inp);
//            System.out.println(String.valueOf(System.currentTimeMillis() - t1) + " miliseconds for MergeSort with " + n + " test cases.");
//        }
//        for (int n : testCases) {
//            int[] inp = QuadSorts.randomArr(n);
//            double t1 = System.currentTimeMillis();
//            QuadSorts.insertionSort(inp);
//            System.out.println(String.valueOf(System.currentTimeMillis() - t1) + " miliseconds for Insert Sort with " + n + " test cases.");
//        }
//        for (int n : testCases) {
//            int[] inp = QuadSorts.randomArr(n);
//            double t1 = System.currentTimeMillis();
//            QuadSorts.selectionSort(inp);
//            System.out.println(String.valueOf(System.currentTimeMillis() - t1) + " miliseconds for SelectionSort with " + n + " test cases.");
//        }
//    }
//}