package pl.put.poznan.sorting.logic;

public class MergeSort {
    public class InsertionSort {
        /*Function to sort array using insertion sort*/
        void sort(int arr[])
        {
            int n = arr.length;
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

        public int[] sortData(int[] data_in)
        {   int[] wynik = data_in;
            sort(wynik);
            return wynik;
        }
    };
}