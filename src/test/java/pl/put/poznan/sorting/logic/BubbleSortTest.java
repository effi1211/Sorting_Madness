package pl.put.poznan.sorting.logic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

class BubbleSortTest {
    private final BubbleSort sort = new BubbleSort();
    int[] liczby = new int[] {};
    String[] znaki;
    String[] spodziewanywynik_znaki;
    int[] spodziewanywynik_liczby = new int[] {};


    @BeforeEach
    public void setUp(){
        liczby = new int[]{3,2,1,6,5,4};
        spodziewanywynik_liczby = new int[] {1,2,3,4,5,6};
        znaki = new String[]{"siema","kaczka","ząb","akwedukt","morświn?"};
        spodziewanywynik_znaki = new String[]{"akwedukt","kaczka","morświn?","siema","ząb"};
    }

    @Test
    void TestBubbleSort(){
        int[] wynik = sort.sortData(liczby,0);
        assertArrayEquals(spodziewanywynik_liczby, wynik);
    }
    @Test
    void TestBubbleSort2(){
        int[] wynik = sort.sortData(liczby,1);
        assertFalse(Arrays.equals(spodziewanywynik_liczby, wynik));
    }

    @Test
    void TestBubbleSortText1(){
        String[] wynik = sort.sortData(znaki,0);
        assertArrayEquals(spodziewanywynik_znaki, wynik);
    }
    @Test
    void TestBubbleSortText2(){
        String[] wynik = sort.sortData(znaki,1);
        assertFalse(Arrays.equals(spodziewanywynik_znaki, wynik));
    }
}