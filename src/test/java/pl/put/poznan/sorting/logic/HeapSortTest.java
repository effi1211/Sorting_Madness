package pl.put.poznan.sorting.logic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeapSortTest {
    private final HeapSort sort = new HeapSort();
    int[] liczby = new int[] {};
    int[] spodziewanywynik_liczby = new int[] {};


    @BeforeEach
    void setUp() {
        liczby = new int[]{3,2,1,6,5,4};
        spodziewanywynik_liczby = new int[] {1,2,3,4,5,6};
    }

    @Test
    void TestHeapSort(){
        int[] wynik = sort.sortData(liczby,0);
        assertArrayEquals(spodziewanywynik_liczby, wynik);
    }

}