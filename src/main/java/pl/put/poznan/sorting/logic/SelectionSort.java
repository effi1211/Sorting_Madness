package pl.put.poznan.sorting.logic;

// Java program for implementation of Selection Sort
public class SelectionSort
{
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

    public int[] sortData(int[] data_in,int iter)
    {
        sort(data_in, iter);
        return data_in;
    }
}
