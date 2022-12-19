package pl.put.poznan.sorting.logic;

/**
 * SelectionSort
 */
public class SelectionSort implements SortingTemplate
{
    /**
     * This function sorts arrays of numbers :)
     *
     * @param arr array of numbers
     * @param iter number of iteration
     */
    void sort(int[] arr, int iter)
    {
        int n = iter;
        if (iter <= 0 || iter > arr.length)
        {
            n = arr.length;
        }

// One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
// Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

// Swap the found minimum element with the first
// element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    /**
     * This function sorts arrays of strings :)
     *
     * @param arr array of strings
     * @param iter number of iteration
     */
    void sort(String[] arr, int iter)
    {
        int n = iter;
        if (iter <= 0 || iter > arr.length)
        {
            n = arr.length;
        }

// One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
// Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[min_idx].compareTo(arr[j]) > 0)
                    min_idx = j;

// Swap the found minimum element with the first
// element
            String temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
    /**
     * This function sorts arrays of numbers.
     *
     * @param data_in array of numbers.
     * @return sorted array of numbers.
     */
    public int[] sortData(int[] data_in,int iter)
    {
        sort(data_in, iter);
        return data_in;
    }
    /**
     * This function sorts arrays of strings.
     *
     * @param data_in array of strings.
     * @return sorted array of strings.
     */
    public String[] sortData(String[] data_in,int iter)
    {
        sort(data_in, iter);
        return data_in;
    }
}
