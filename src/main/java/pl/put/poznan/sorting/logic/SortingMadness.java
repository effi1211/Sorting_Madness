package pl.put.poznan.sorting.logic;

import java.lang.invoke.SwitchPoint;

/**
 * This is just an example to show that the logic should be outside the REST service.
 */
public class SortingMadness {
    public static class result {
        public long time;
        public String algorithmName;
        public int[] sorted;
    }
    public result sort(int[] text, int iterations, boolean desc){
        SelectionSort select = new SelectionSort();
        result result = new result();

        TimeControl timer = new TimeControl();
        result.algorithmName = "selection";
        timer.startTime();
        result.sorted = select.sortData(text, iterations);
        timer.stopTime();
        result.time = timer.getTime();
        result.sorted = reverse(result.sorted);

        return result;

    }

    static void printArray(int[] arr)
    {
        for (int j : arr) System.out.print(j + " ");
        System.out.println();
    }
    public static void main(String[] args)
    {   TimeControl timer = new TimeControl();
        int[] arr = {64,25,12,22,11,45,76,767,56,434,43,54,65,76,78,887,566556,45,45,545454,4554,5454,54,4545,54,54,54,54,45,34,4,3,5465};
        if(arr.length == 0){
            System.out.println("Empty Array");
            return;
        }

        BubbleSort bubbles = new BubbleSort();
        HeapSort heap = new HeapSort();
        InsertionSort insert = new InsertionSort();
        MergeSort merge = new MergeSort();
        QuickSort quick = new QuickSort();
        SelectionSort select = new SelectionSort();

        timer.startTime();
        timer.stopTime();

        System.out.println("Sorted array");
        System.out.println(timer.getTime());
        printArray(select.sortData(arr, 0));
        printArray(reverse(select.sortData(arr, 0)));
    }

    static int[] reverse(int[] a)
    {   int n = a.length;
        int[] b = new int[n];
        int j = n;
        for (int k : a) {
            b[j - 1] = k;
            j = j - 1;
        }

        return b;
    }
}
