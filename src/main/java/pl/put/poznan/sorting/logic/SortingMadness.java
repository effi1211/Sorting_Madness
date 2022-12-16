package pl.put.poznan.sorting.logic;

/**
 * This is just an example to show that the logic should be outside the REST service.
 */
public class SortingMadness {

    private final String[] transforms;

    public SortingMadness(String[] transforms){
        this.transforms = transforms;
    }

    public String transform(String text){
        // of course, normally it would do something based on the transforms
        return text.toUpperCase();
    }

    static void printArray(int[] arr)
    {
        for (int j : arr) System.out.print(j + " ");
        System.out.println();
    }
    public static void main(String[] args)
    {   TimeControl timer = new TimeControl();
        BubbleSort ob = new BubbleSort();
        int[] arr = {64,25,12,22,11,45,76,767,56,434,43,54,65,76,78,887,566556,45,45,545454,4554,5454,54,4545,54,54,54,54,45,34,4,3,5465};
        timer.startTime();
        int[] a = ob.sortData(arr);
        timer.stopTime();

        System.out.println("Sorted array");
        System.out.println(timer.getTime());
        printArray(reverse(a));
    }

    static int[] reverse(int[] a)
    {   int n = a.length;
        int[] b = new int[n];
        int j = n;
        for (int k : a) {
            b[j - 1] = k;
            j = j - 1;
        }

        return b;
    }
}
