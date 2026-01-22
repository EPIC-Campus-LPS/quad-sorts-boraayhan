# QuadSorts

For this lab, you will create a class `QuadSorts` with four static methods.
    - `public static int[] bubbleSort(int[] arr)` - sorts an array _arr_ using bubble sort and returns the sorted array
    - `public static int[] selectionSort(int[] arr)` - sorts an array _arr_ using selection sort and returns the sorted array
    - `public static int[] insertionSort(int[] arr` - sorts an array _arr_ using insertion sort and returns the sorted array
    - `public static int[] mergeSort(int[] arr)` - sorts an array _arr_ using merge sort and returns the sorted array
- Use `System.currentTimeMillis()` in a new class`SortingTester` to time each of the 4 sorts for random arrays of size `n` = 100, 1000, 10000, 100000, 1000000. 
- **Optional:** Include a quicksort algorithm in your `QuadSorts` class and update `SortingTester` to test quicksort as well.
- Use Google Sheets or a similar program to create a graph of how long each method takes for each of 5 given values of `n`. 
	- Add common functions like `n`, `n^2`, `n!`, `log(n)` etc. to your graph as well to make a prediction of the numerical runtime for each sorting method. 
	- Upload your graph to your repository when it is complete.
