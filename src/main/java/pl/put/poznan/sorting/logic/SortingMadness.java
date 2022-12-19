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
        SortingTemplate sortAlgoritm;
        if (Objects.equals(algorithm, "auto")){
            DetectType detector = new DetectType(data);
            algorithm = detector.detectSortType();
            result.algorithmName = "auto - ".concat(algorithm);
        }

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
