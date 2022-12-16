package pl.put.poznan.sorting.logic;

public class TimeControl {

    private static long start;
    private static long finish;


    public void startTime(){
        start = System.nanoTime();
    }

    public void stopTime(){
        finish = System.nanoTime();
    }

    public long getTime(){
        return finish-start;
    }
}
