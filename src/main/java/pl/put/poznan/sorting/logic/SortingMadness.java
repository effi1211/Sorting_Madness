package pl.put.poznan.sorting.logic;

import java.lang.invoke.SwitchPoint;

/**
 * This is just an example to show that the logic should be outside the REST service.
 */
public class SortingMadness {

    private final String[] transforms;

    public SortingMadness(String[] transforms){
        this.transforms = transforms;
    }

    public String transform(String text){
        // of course, normally it would do something based on the transforms
        return text.toUpperCase();
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
        int[] a = heap.sortData(arr, 0);
        timer.stopTime();

        System.out.println("Sorted array");
        System.out.println(timer.getTime());
        printArray(a);
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
