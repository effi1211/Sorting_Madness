package pl.put.poznan.sorting.logic;

class BubbleSort {
    void bubbleSort(int[] arr, int iter)
    {   int n = iter;
        if (iter == -1 || iter > arr.length)
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

    public int[] sortData(int[] data_in, int iter)
    {
        bubbleSort(data_in, iter);
        return data_in;
    }
}