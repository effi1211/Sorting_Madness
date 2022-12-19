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
     * @param arr array of numbers
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


    static void heapForm(String k)
    {
        x++;

        heap[x] = k;

        int child = x;

        String tmp;

        int index = x / 2;

        // Iterative heapiFy
        while (index >= 0)
        {

            // Just swapping if the element
            // is smaller than already
            // stored element
            if (heap[index].compareTo(heap[child]) > 0)
            {

                // Swapping the current index
                // with its child
                tmp = heap[index];
                heap[index] = heap[child];
                heap[child] = tmp;
                child = index;

                // Moving upward in the
                // heap
                index = index / 2;
            }
            else
            {
                break;
            }
        }
    }

    // Used for index in heap
    static int x = -1;

    // Predefining the heap array
    static String []heap = new String[1000];
    // Defining heap sort
    static void heapSort()
    {
        int left1, right1;

        while (x >= 0)
        {
            String k;
            k = heap[0];

            // Taking output of
            // the minimum element
            System.out.print(k + " ");

            // Set first element
            // as a last one
            heap[0] = heap[x];

            // Decrement of the
            // size of the string
            x = x - 1;

            String tmp;

            int index = 0;

            int length = x;

            // Initializing the left
            // and right index
            left1 = 1;

            right1 = left1 + 1;

            while (left1 <= length)
            {

                // Process of heap sort
                // If root element is
                // minimum than its both
                // of the child then break
                if (heap[index].compareTo(heap[left1]) <= 0 &&
                        heap[index].compareTo(heap[right1]) <= 0)
                {
                    break;
                }

                // Otherwise checking that
                // the child which one is
                // smaller, swap them with
                // parent element
                else
                {

                    // Swapping
                    if (heap[left1].compareTo(heap[right1])< 0)
                    {
                        tmp = heap[index];
                        heap[index] = heap[left1];
                        heap[left1] = tmp;
                        index = left1;
                    }

                    else
                    {
                        tmp = heap[index];
                        heap[index] = heap[right1];
                        heap[right1] = tmp;
                        index = right1;
                    }
                }

                // Changing the left index
                // and right index
                left1 = 2 * left1;
                right1 = left1 + 1;
            }
        }
    }

    // Utility function
    static void sort(String[] k, int n)
    {

        // To heapiFy
        for (int i = 0; i < n; i++)
        {
            heapForm(k[i]);
        }

        // Calling heap sort function
        heapSort();
    }
    // Utility function
    static void sortText(String[] k, int n)
    {

        // To heapiFy
        for (int i = 0; i < n; i++)
        {
            heapForm(k[i]);
        }

        // Calling heap sort function
        heapSort();
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
