package pl.put.poznan.sorting.logic;

public class QuickSort implements SortingTemplate
{
    private int iter=0;
    private int itermax=0;

    int partition(int[] arr, int low, int high)
    {
        int pivot = arr[high];
        int i = (low-1); // index of smaller element
        for (int j=low; j<high; j++)
        {

            if (arr[j] <= pivot)
            {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }
    int partitionText(String[] arr, int low, int high)
    {
        String pivot = arr[high];
        int i = (low-1); // index of smaller element
        for (int j=low; j<high; j++)
        {

            if (arr[j].compareTo(pivot) <= 0)
            {
                i++;

                String temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        String temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }

    void sort(int[] arr, int low, int high)
    {   iter = iter +1;
        if (low < high && (iter < itermax || itermax <=0))
        {

            int pi = partition(arr, low, high);

            sort(arr, low, pi-1);
            sort(arr, pi+1, high);
        }
    }
    void sortText(String[] arr, int low, int high)
    {   iter = iter +1;
        if (low < high && (iter < itermax || itermax <=0))
        {

            int pi = partitionText(arr, low, high);

            sortText(arr, low, pi-1);
            sortText(arr, pi+1, high);
        }
    }
    public int[] sortData(int[] data_in, int i)
    {
        int n = data_in.length;
        iter = 0;
        itermax = i;
        sort(data_in, 0 , n-1);
        return data_in;
    }
    public String[] sortData(String[] data_in, int i)
    {
        int n = data_in.length;
        iter = 0;
        itermax = i;
        sortText(data_in, 0 , n-1);
        return data_in;
    }
}
