package pl.put.poznan.sorting.logic;

/**
 * Heap sort
 */
// Java program for implementation of Heap Sort
public class HeapSort implements SortingTemplate
{
    /**
     * This function sorts arrays of numbers
     *
     * @param arr array of numbers
     * @param iter number of iteration
     */
    public void sort(int[] arr, int iter)
    {
        int n = iter;
        if (iter <= 0 || iter > arr.length)
        {
            n = arr.length;
        }

        // Build heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);

        // One by one extract an element from heap
        for (int i=n-1; i>=0; i--)
        {
            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            // call max heapify on the reduced heap
            heapify(arr, i, 0);
        }
    }

    /**
     * To Heapify a subtree rooted with node i which is an index in arr[].
     * @param arr array of Strings
     * @param i node
     * @param n size of heap
     */
    void heapify(int[] arr, int n, int i)
    {
        int largest = i; // Initialize largest as root
        int l = 2*i + 1; // left = 2*i + 1
        int r = 2*i + 2; // right = 2*i + 2

        // If left child is larger than root
        if (l < n && arr[l] > arr[largest])
            largest = l;

        // If right child is larger than largest so far
        if (r < n && arr[r] > arr[largest])
            largest = r;

        // If largest is not root
        if (largest != i)
        {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Recursively heapify the affected subtree
            heapify(arr, n, largest);
        }
    }

    /**
     * This function sorts arrays of numbers
     *
     * @param arr array of Strings
     * @param iter number of iteration
     */
    public void sortText(String[] arr, int iter)
    {
        int n = iter;
        if (iter <= 0 || iter > arr.length)
        {
            n = arr.length;
        }

        // Build heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--)
            heapifyText(arr, n, i);

        // One by one extract an element from heap
        for (int i=n-1; i>=0; i--)
        {
            // Move current root to end
            String temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            // call max heapify on the reduced heap
            heapifyText(arr, i, 0);
        }
    }

    /**
     * To Heapify a subtree rooted with node i which is an index in arr[].
     * @param arr array of numbers
     * @param i node
     * @param n size of heap
     */
    void heapifyText(String[] arr, int n, int i)
    {
        int largest = i; // Initialize largest as root
        int l = 2*i + 1; // left = 2*i + 1
        int r = 2*i + 2; // right = 2*i + 2

        // If left child is larger than root
        if (l < n && arr[l].compareTo(arr[largest]) > 0)
            largest = l;

        // If right child is larger than largest so far
        if (r < n && arr[r].compareTo(arr[largest]) > 0)
            largest = r;

        // If largest is not root
        if (largest != i)
        {
            String swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Recursively heapify the affected subtree
            heapifyText(arr, n, largest);
        }
    }


    /**
     * This function sorts arrays of numbers.
     *
     * @param data_in array of numbers.
     * @return sorted array of numbers.
     */
    @Override
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
