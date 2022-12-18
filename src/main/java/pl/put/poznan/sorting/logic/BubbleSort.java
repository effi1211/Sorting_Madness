package pl.put.poznan.sorting.logic;

/**
 * Bubble Sort class
 */
class BubbleSort implements SortingTemplate{

    /**
     * Sorting function for numbers
     * @param arr name of data input numbers array
     * @param iter number of iteration
     */
    void bubbleSort(int[] arr, int iter)
    {   int n = iter;
        if (iter <= 0 || iter > arr.length)
        {
            n = arr.length;
        }

        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }

    /**
     * Sorting function for String
     * @param arr name of data input string array
     * @param iter number of iteration
     * @return
     */
    public String[] bubbleSortText(String[] arr,int iter) {
        int n = arr.length;
        if (iter <= 0 || iter > arr.length)
        {
            n = arr.length;
        }

        String temp;

        for (int j = 0; j < n - 1; j++)
        {
            for (int i = j + 1; i < n; i++)
            {
                if (arr[j].compareTo(arr[i]) > 0)
                {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr;
    }

    public int[] sortData(int[] data_in, int iter)
    {
        bubbleSort(data_in, iter);
        return data_in;
    }
    public String[] sortData(String[] data_in, int iter)
    {
        bubbleSortText(data_in, iter);
        return data_in;
    }
}