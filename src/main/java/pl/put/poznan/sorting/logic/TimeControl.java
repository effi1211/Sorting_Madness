package pl.put.poznan.sorting.logic;
/**
 * Time Control Function
 */
public class TimeControl {
    /**
     * Start of the timecount
     */
    private static long start;
    /**
     * Stop of the timecount
     */
    private static long finish;

    /**
     * Starts counting time
     */
    public void startTime(){
        start = System.nanoTime();
    }
    /**
     * Stop counting time
     */
    public void stopTime(){
        finish = System.nanoTime();
    }
    /**
     * This function returns the time of the sorting algorithm
     * @return (finish-start) time of algorithm
     */
    public long getTime(){
        return finish-start;
    }
}
