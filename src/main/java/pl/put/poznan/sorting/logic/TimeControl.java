package pl.put.poznan.sorting.logic;
/**
 * Time Control Function
 */
public class TimeControl {
    /**
     * Time when sorting started
     */
    private static long start;
    /**
     * Time at the end of the sort
     */
    private static long finish;

    /**
     * Starts counting time function
     */
    public void startTime(){
        start = System.currentTimeMillis();
    }
    /**
     * Stop counting time function
     */
    public void stopTime(){
        finish = System.currentTimeMillis();
    }
    /**
     * This function returns the time of the sorting algorithm
     * @return (finish-start) time of algorithm
     */
    public long getTime(){
        return finish-start;
    }
}
