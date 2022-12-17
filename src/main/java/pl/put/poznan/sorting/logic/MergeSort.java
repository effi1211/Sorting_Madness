package pl.put.poznan.sorting.logic;
/**
 * MergeSort
 */
public class MergeSort {

    private int iter=0;
    private int itermax=0;
    /**
     * This merges the arrays :)
     *
     * @param arr array of numbers
     * @param l beginning of first subarray [l...m]
     * @param m end of first subarray [l...m] and beginning of second array [m+1...r]
     * @param r end of second subarray [m+1...r]
     */
    void merge(int[] arr, int l, int m, int r)
    {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        /* Create temp arrays */
        int[] L = new int[n1];
        int[] R = new int[n2];

        /*Copy data to temp arrays*/
        System.arraycopy(arr, l, L, 0, n1);
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarray array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    /**
     * Main function that sorts arr[l..r] using merge()
     *
     * @param arr array of numbers
     * @param l beginning of array [l...r]
     * @param r end of array [l...r]
     */
    void sort(int[] arr, int l, int r)
    {   iter = iter +1;
        if (l < r&& (iter < itermax || itermax <=0))
        {
            // Find the middle point
            int m = l + (r - l) / 2;

            // Sort first and second halves
            sort(arr, l, m);
            sort(arr, m + 1, r);

            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }
    /**
     * This function sorts arrays of numbers :)
     *
     * @param data_in array of numbers
     * @param i number of iteration
     * @return sorted array
     */
        public int[] sortData(int[] data_in, int i)
        {
            iter = 0;
            itermax = i;
            sort(data_in,0,data_in.length-1);
            return data_in;
        }
    }

