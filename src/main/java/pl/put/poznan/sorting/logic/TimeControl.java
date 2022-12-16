package pl.put.poznan.sorting.logic;

public class TimeControl {

    private static long start;
    private static long finish;
    private static long sorttime;


    public void startTime(){
        start = System.currentTimeMillis();
    }

    public void stopTime(){
        finish = System.currentTimeMillis();
    }

    public long getTime(){
        sorttime = finish-start;
        return sorttime;
    }
}
