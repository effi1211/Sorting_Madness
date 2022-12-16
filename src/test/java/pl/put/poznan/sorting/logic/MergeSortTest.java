package pl.put.poznan.sorting.logic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortTest {

    private final MergeSort sort = new MergeSort();
    int[] liczby = new int[] {};
    int[] spodziewanywynik_liczby = new int[] {};


    @BeforeEach
    public void setUp(){
        liczby = new int[]{3,2,1,6,5,4};
        spodziewanywynik_liczby = new int[] {1,2,3,4,5,6};
    }

    @Test
    void TestInsertionSort(){
        int[] wynik = sort.sortData(liczby);
        assertArrayEquals(spodziewanywynik_liczby, wynik);
    }

}