package pl.put.poznan.sorting.logic;

public class InsertionSort implements SortingTemplate{
    /*Function to sort array using insertion sort*/
    void sort(int[] arr, int iter)
    {   int n = iter;
        if (iter <= 0 || iter > arr.length)
        {
            n = arr.length;
        }
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

/* Move elements of arr[0..i-1], that are
greater than key, to one position ahead
of their current position */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public String[] sortText(String[] arr,int iter) {

        int f = iter;
        if (iter <= 0 || iter > arr.length)
        {
            f = arr.length;
        }

        String temp = "";

        for(int i = 0; i < f; i++) {
            for (int j = i + 1; j < f; j++) {
                if (arr[i].compareToIgnoreCase(arr[j]) > 0) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return arr;
    }

    public int[] sortData(int[] data_in, int iter)
    {
        sort(data_in, iter);
        return data_in;
    }

    public String[] sortData(String[] data_in, int iter)
    {
        sortText(data_in, iter);
        return data_in;
    }
}