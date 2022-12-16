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

    public static void main(String args[])
    {
        HeapSort ob = new HeapSort();
        int arr[] = {64,25,12,22,11};
        int[] a = ob.sortData(arr);
        System.out.println("Sorted array");
        ob.printArray(a);
    }
}
