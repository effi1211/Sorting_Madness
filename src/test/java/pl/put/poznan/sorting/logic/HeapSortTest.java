package pl.put.poznan.sorting.logic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class HeapSortTest {
    private final HeapSort sort = new HeapSort();
    int[] liczby = new int[] {};
    String[] znaki;
    int[] spodziewanywynik_liczby = new int[] {};
    String[] spodziewanywynik_znaki;


    @BeforeEach
    void setUp() {
        liczby = new int[]{3,2,1,6,5,4};
        spodziewanywynik_liczby = new int[] {1,2,3,4,5,6};
        znaki = new String[]{"siema","kaczka","ząb","akwedukt","morświn?"};
        spodziewanywynik_znaki = new String[]{"akwedukt","kaczka","morświn?","siema","ząb"};
    }

    @Test
    void TestHeapSort(){
        int[] wynik = sort.sortData(liczby,0);
        assertArrayEquals(spodziewanywynik_liczby, wynik);
    }

    @Test
    void TestHeapSort2(){
        int[] wynik = sort.sortData(liczby,1);
        assertFalse(Arrays.equals(spodziewanywynik_liczby, wynik));
    }

    @Test
    void TestHeapSortText1(){
        String[] wynik = sort.sortData(znaki,0);
        System.out.print(Arrays.toString(wynik));
        System.out.print(Arrays.toString(spodziewanywynik_znaki));
        assertArrayEquals(spodziewanywynik_znaki, wynik);
    }

    @Test
    void TestHeapSortText2(){
        String[] wynik = sort.sortData(znaki,1);
        assertFalse(Arrays.equals(spodziewanywynik_znaki, wynik));
    }

}