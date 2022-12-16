package pl.put.poznan.sorting.logic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

class BubbleSortTest {
    private BubbleSort bubbles = new BubbleSort();
    int[] liczby = new int[] {};
    int[] spodziewanywynik_liczby = new int[] {};


    @BeforeEach
    public void setUp(){
        liczby = new int[]{3,2,1,6,5,4};
        spodziewanywynik_liczby = new int[] {1,2,3,4,5,6};
    }

    @Test
    void TestBubbleSort(){
        int[] wynik = bubbles.sortData(liczby);
        Assertions.assertTrue(Arrays.equals(spodziewanywynik_liczby,wynik));
    }
}