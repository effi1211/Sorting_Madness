package pl.put.poznan.sorting.logic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class QuickSortTest {
    private final QuickSort sort = new QuickSort();
    int[] liczby = new int[] {};
    int[] spodziewanywynik_liczby = new int[] {};
    String[] slowa = new String[] {};
    String[] spodziewanywynik_slowa = new String[] {};


    @BeforeEach
    public void setUp(){
        liczby = new int[]{3,2,1,6,5,4};
        spodziewanywynik_liczby = new int[] {1,2,3,4,5,6};
        slowa = new String[] {"dada","dcaa","abc","ccc","bbb","aaa"};
        spodziewanywynik_slowa = new String[] {"aaa","abc","bbb","ccc","dada","dcaa"};

    }

    @Test
    void TestQuickSort(){
        int[] wynik = sort.sortData(liczby,0);
        assertArrayEquals(spodziewanywynik_liczby, wynik);
    }

    @Test
    void TestQuickSort2(){
        int[] wynik = sort.sortData(liczby,1);
        assertFalse(Arrays.equals(spodziewanywynik_liczby, wynik));
    }
    @Test
    void TestQuickText1(){
        String[] wynik = sort.sortData(slowa,0);
        assertArrayEquals(spodziewanywynik_slowa, wynik);
    }
    @Test
    void TestQuickText2(){
        String[] wynik = sort.sortData(slowa,1);
        assertFalse(Arrays.equals(spodziewanywynik_slowa, wynik));
    }

}
