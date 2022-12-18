package pl.put.poznan.sorting.logic;

import java.util.Objects;

/**
 * This is just an example to show that the logic should be outside the REST service.
 */
public class SortingMadness {
    public static class result {
        public long time;
        public String algorithmName;
        public int[] sorted;
    }
    public result sort(int[] data, int iterations, boolean desc, String algorithm){

        result result = new result();
        result.algorithmName = algorithm;
        SortingTemplate sortAlgoritm = null;
        if (Objects.equals(algorithm, "bubble")){
            sortAlgoritm = new BubbleSort();
        }
        else if (Objects.equals(algorithm, "heap"))
        {
            sortAlgoritm = new HeapSort();
        }
        else if (Objects.equals(algorithm, "insert")) {
            sortAlgoritm = new InsertionSort();
        }
        else if (Objects.equals(algorithm, "merge")) {
            sortAlgoritm = new MergeSort();
        }
        else if (Objects.equals(algorithm, "quick")) {
            sortAlgoritm = new QuickSort();
        }
        else if (Objects.equals(algorithm, "select")) {
            sortAlgoritm = new SelectionSort();
        }else
        {
            return null;
        }

        TimeControl timer = new TimeControl();
        timer.startTime();
        result.sorted = sortAlgoritm.sortData(data, iterations);
        timer.stopTime();
        result.time = timer.getTime();
        if (desc)
        {
            result.sorted = reverse(result.sorted);
        }
        return result;

    }

    static void printArray(int[] arr) //TODO do usunięcia na końcu
    {
        for (int j : arr) System.out.print(j + " ");
        System.out.println();
    }
    public static void main(String[] args) //TODO do usunięcia na końcu
    {   TimeControl timer = new TimeControl();
        int[] arr = {64,25,12,22,11,45,76,767,56,434,43,54,65,76,78,887,566556,45,45,545454,4554,5454,54,4545,54,54,54,54,45,34,4,3,5465};
        if(arr.length == 0){
            System.out.println("Empty Array");
            return;
        }
        String algorithm = "heap";
        SortingTemplate sortAlgoritm = null;
        if (Objects.equals(algorithm, "bubble")){
            sortAlgoritm = new BubbleSort();
        }
        else if (Objects.equals(algorithm, "heap"))
        {
            sortAlgoritm = new HeapSort();
        }
        else if (Objects.equals(algorithm, "insert")) {
            sortAlgoritm = new InsertionSort();
        }
        else if (Objects.equals(algorithm, "merge")) {
            sortAlgoritm = new MergeSort();
        }
        else if (Objects.equals(algorithm, "quick")) {
            sortAlgoritm = new QuickSort();
        }
        else if (Objects.equals(algorithm, "select")) {
            sortAlgoritm = new SelectionSort();
        }
        timer.startTime();
        timer.stopTime();

        System.out.println("Sorted array");
        System.out.println(timer.getTime());
        printArray(sortAlgoritm.sortData(arr, 0));
        printArray(reverse(sortAlgoritm.sortData(arr, 0)));
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
