package pl.put.poznan.sorting.logic;

public class DetectType {
    private final int[] data;
    private final int array_length;
    private final float sortedPercentage;

    public DetectType(int[] in)
    {   data = in;
        array_length = in.length;
        sortedPercentage = sortPercent();
    }

    public DetectType(String[] in)
    {
        array_length = in.length;
        sortedPercentage = sortPercent(in);
    }

    public String detectSortType() {

        if(sortedPercentage > 0.8 && array_length < 100) return "bubble";
        if(sortedPercentage > 0.8) return "insert";
        if(sortedPercentage > 0.5) return "quick";
        if(array_length < 100) return "select";
        if(array_length < 500) return "merge";

        return "heap";
    }

    private float sortPercent() {
        int sortedElements = 0;
        for(int i = 1; i < array_length; i++) {
            if(data[i] < data[i-1]) {
                sortedElements++;
                if(i == array_length /2 + 1)
                    if((float) sortedElements/i < 0.5) return (float) sortedElements/i;
            }
        }
        return (float) sortedElements/array_length;
    }

    private float sortPercent(String[] data) {
        int sortedElements = 0;
        for(int i = 1; i < array_length; i++) {
            if(data[i].compareTo(data[i-1]) > 0) {
                sortedElements++;
                if(i == array_length /2 + 1)
                    if((float) sortedElements/i < 0.5) return (float) sortedElements/i;
            }
        }
        return (float) sortedElements/array_length;
    }


}
